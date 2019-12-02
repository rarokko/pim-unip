package com.unip.pimfrotas.controller;
 
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.multi.MultiLookAndFeel;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.unip.pimfrotas.model.Abastecimento;
import com.unip.pimfrotas.model.Cliente;
import com.unip.pimfrotas.model.Manutencao;
import com.unip.pimfrotas.model.Motorista;
import com.unip.pimfrotas.model.Multa;
import com.unip.pimfrotas.model.Pecas;
import com.unip.pimfrotas.model.Pneu;
import com.unip.pimfrotas.model.Seguro;
import com.unip.pimfrotas.model.User;
import com.unip.pimfrotas.model.Veiculo;
import com.unip.pimfrotas.model.Viagem;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.server.handler.ExceptionHandlingWebHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")

public class Routesv1 {

  DbConnection db = new DbConnection();
  Connection conn = null;
  PreparedStatement preparedStatement = null;
  Statement stmt = null;
  ResultSet rs = null;
  String query = "";
  
  @PostMapping("/registerUser")
  public String registerUser(@RequestBody User user) {
    String nomeDoUsuario = user.getNomeDoUsuario();
    String senha = user.getSenha();
    query = "INSERT INTO MecFrotas.LOGIN VALUES ('" + nomeDoUsuario + "', '" + senha + "')";
    rs = db.query(query);
    return HttpStatus.OK.toString();
  };
  
  @PostMapping("/loginUser")
  public ResponseEntity<String> loginUser(@RequestBody User user) {
    String nomeDoUsuario = user.getNomeDoUsuario();
    String senha = user.getSenha();
    query = "SELECT NomeDoUsuario, Senha FROM MecFrotas.LOGIN WHERE NomeDoUsuario = '" + nomeDoUsuario + "' AND Senha = '" + senha + "'";
    rs = db.query(query);
    try {
      int count = 0;
      while (rs.next()) {
          ++count;
      }
      if (count == 0) {
        return new ResponseEntity<>(HttpStatus.FORBIDDEN.toString(), HttpStatus.FORBIDDEN);
      } else {
        return new ResponseEntity<>(HttpStatus.OK.toString(), HttpStatus.OK);
      }
    } catch (SQLException ex) {
      System.out.println("VendorError: " + ex.getErrorCode());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  };

  @GetMapping("/abastecimento")
  public ResponseEntity<String> getAbastecimento(@RequestParam(required = false) String id) {
    String abastecimentoId = id;
    System.out.print(id);
    query = "SELECT * FROM MecFrotas.Abastecimento";

    if (id != null) {
      query += " WHERE AbastecimentoID = '" + abastecimentoId + "'";
    };

    rs = db.query(query);
    ArrayList<Abastecimento> abastecimentoLista = new ArrayList<Abastecimento>();
    try {
      while (rs.next()) {
          Abastecimento abastecimentoItem = new Abastecimento(
            rs.getString("DataAbastecimento"),
            rs.getString("PostoAbastecimento"),
            rs.getString("TipoCombustivelAbastecimento"),
            rs.getString("LitrosAbastecimento"),
            rs.getString("ValorTotalAbastecimento"),
            rs.getString("ClienteID"),
            rs.getString("PlacaVeiculo")
          );
          abastecimentoLista.add(abastecimentoItem);
      }
      return new ResponseEntity<>(abastecimentoLista.toString(), HttpStatus.OK);
    } catch (SQLException ex) {
      System.out.println("VendorError: " + ex.getErrorCode());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  };

  @PostMapping("/abastecimento")
  public String insertAbastecimento(@RequestBody Abastecimento abastecimento) {

    String dataAbastecimento = abastecimento.getDataAbastecimento();
    String postoAbastecimento = abastecimento.getPostoAbastecimento();
    String tipoCombustivelAbastecimento = abastecimento.getTipoCombustivelAbastecimento();
    String litrosAbastecimento = abastecimento.getLitrosAbastecimento();
    String valorTotalAbastecimento = abastecimento.getValorTotalAbastecimento();
    String clienteId = abastecimento.getClienteId();
    String placaVeiculo = abastecimento.getPlacaVeiculo();

    query = "INSERT INTO MecFrotas.Abastecimento (DataAbastecimento, PostoAbastecimento, TipoCombustivelAbastecimento, LitrosAbastecimento, ValorTotalAbastecimento, ClienteID, PlacaVeiculo) VALUES ('"
    + dataAbastecimento + 
    "', '" 
    + postoAbastecimento + 
    "', '" 
    + tipoCombustivelAbastecimento + 
    "', '" 
    + litrosAbastecimento + 
    "', '" 
    + valorTotalAbastecimento + 
    "', '" 
    + clienteId + 
    "', '" 
    + placaVeiculo + 
    "')";
    rs = db.query(query);
    return HttpStatus.OK.toString();
  };

  @GetMapping("/veiculo")
  public ResponseEntity<String> getVeiculo(@RequestParam(required = false) String placaVeiculo) {
    query = "SELECT * FROM MecFrotas.Veiculo";

    if (placaVeiculo != null) {
      query += " WHERE PlacaVeiculo = '" + placaVeiculo + "'";
    };

    rs = db.query(query);
    ArrayList<Veiculo> veiculoLista = new ArrayList<Veiculo>();
    try {
      while (rs.next()) {
          Veiculo veiculoItem = new Veiculo(
            rs.getString("PlacaVeiculo"),
            rs.getString("CodigoInternoVeiculo"),
            rs.getString("MarcaVeiculo"),
            rs.getString("ModeloVeiculo"),
            rs.getString("CorVeiculo"),
            rs.getString("AnoVeiculo"),
            rs.getString("QuilometragemAtualVeiculo"),
            rs.getString("QntdCombustivelVeiculo"),
            rs.getString("TipoCombustivelVeiculo"),
            rs.getString("TipoVeiculo"),
            rs.getString("MotorizacaoVeiculo"),
            rs.getString("ClienteID")
          );
          veiculoLista.add(veiculoItem);
      }
      return new ResponseEntity<>(veiculoLista.toString(), HttpStatus.OK);
    } catch (SQLException ex) {
      System.out.println("VendorError: " + ex.getErrorCode());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  };

  @PostMapping("/veiculo")
  public String insertVeiculo(@RequestBody Veiculo veiculo) {

    String placaVeiculo = veiculo.getPlacaVeiculo();
    String codigoInternoVeiculo = veiculo.getCodigoInternoVeiculo();
    String marcaVeiculo = veiculo.getMarcaVeiculo();
    String modeloVeiculo = veiculo.getModeloVeiculo();
    String corVeiculo = veiculo.getCorVeiculo();
    String anoVeiculo = veiculo.getAnoVeiculo();
    String quilometragemAtualVeiculo = veiculo.getQuilometragemAtualVeiculo();
    String qntdCombustivelVeiculo = veiculo.getQntdCombustivelVeiculo();
    String tipoCombustivelVeiculo = veiculo.getTipoCombustivelVeiculo();
    String tipoVeiculo = veiculo.getTipoVeiculo();
    String motorizacaoVeiculo = veiculo.getMotorizacaoVeiculo();
    String clienteId = veiculo.getClienteId();

    query = "INSERT INTO MecFrotas.Veiculo VALUES ('" 
    + placaVeiculo + 
    "', '" 
    + codigoInternoVeiculo + 
    "', '" 
    + marcaVeiculo + 
    "', '" 
    + modeloVeiculo + 
    "', '" 
    + corVeiculo + 
    "', '" 
    + anoVeiculo + 
    "', '" 
    + quilometragemAtualVeiculo + 
    "', '" 
    + qntdCombustivelVeiculo + 
    "', '" 
    + tipoCombustivelVeiculo + 
    "', '" 
    + tipoVeiculo + 
    "', '" 
    + motorizacaoVeiculo + 
    "', '" 
    + clienteId + 
    "')";
    rs = db.query(query);
    return HttpStatus.OK.toString();
  };

  @GetMapping("/cliente")
  public ResponseEntity<String> getCliente(@RequestParam(required = false) String id) {
    query = "SELECT * FROM MecFrotas.Cliente";

    if (id != null) {
      query += " WHERE ClienteID = '" + id + "'";
    };

    rs = db.query(query);
    ArrayList<Cliente> clienteLista = new ArrayList<Cliente>();
    try {
      while (rs.next()) {
          Cliente clienteItem = new Cliente(
            rs.getString("RazaoSocialCliente"),
            rs.getString("CnpjCliente"),
            rs.getString("EnderecoCliente"),
            rs.getString("BairroCliente"),
            rs.getString("CidadeCliente"),
            rs.getString("EstadoCliente"),
            rs.getString("Ativo"),
            rs.getString("EmailCliente"),
            rs.getString("TelefoneCliente"),
            rs.getString("QntdVeiculosCliente"),
            rs.getString("QntdMotoristasCliente")
          );
          clienteLista.add(clienteItem);
      }
      return new ResponseEntity<>(clienteLista.toString(), HttpStatus.OK);
    } catch (SQLException ex) {
      System.out.println("VendorError: " + ex.getErrorCode());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  };

  @PostMapping("/cliente")
  public String insertClient(@RequestBody Cliente cliente) {

    String razaoSocialCliente = cliente.getRazaoSocialCliente();
    String cnpjCliente = cliente.getCnpjCliente();
    String enderecoCliente = cliente.getEnderecoCliente();
    String bairroCliente = cliente.getBairroCliente();
    String cidadeCliente = cliente.getCidadeCliente();
    String estadoCliente = cliente.getEstadoCliente();
    String ativo = cliente.getAtivo();
    String emailCliente = cliente.getEmailCliente();
    String telefoneCliente = cliente.getTelefoneCliente();
    String qntdVeiculosCliente = cliente.getQntdVeiculosCliente();
    String qntdMotoristasCliente = cliente.getQntdMotoristasCliente();

    query = "INSERT INTO MecFrotas.Cliente (RazaoSocialCliente, CnpjCliente, EnderecoCliente, BairroCliente, CidadeCliente, EstadoCliente, Ativo, EmailCliente, TelefoneCliente, QntdVeiculosCliente, QntdMotoristasCliente) VALUES ('" 
    + razaoSocialCliente + 
    "', '" 
    + cnpjCliente + 
    "', '" 
    + enderecoCliente + 
    "', '" 
    + bairroCliente + 
    "', '" 
    + cidadeCliente + 
    "', '" 
    + estadoCliente + 
    "', '" 
    + ativo + 
    "', '" 
    + emailCliente + 
    "', '" 
    + telefoneCliente + 
    "', '" 
    + qntdVeiculosCliente + 
    "', '" 
    + qntdMotoristasCliente + 
    "')";
    rs = db.query(query);
    return HttpStatus.OK.toString();
  };

  @GetMapping("/manutencao")
  public ResponseEntity<String> getManutencao(@RequestParam(required = false) String id) {
    query = "SELECT * FROM MecFrotas.Manutencao";

    if (id != null) {
      query += " WHERE ManutencaoID = '" + id + "'";
    };

    rs = db.query(query);
    ArrayList<Manutencao> manutencaoLista = new ArrayList<Manutencao>();
    try {
      while (rs.next()) {
          Manutencao manutencaoItem = new Manutencao(
            rs.getString("DataManutencao"),
            rs.getString("EmpresaManutencao"),
            rs.getString("TipoManutencao"),
            rs.getString("DescricaoManutencao"),
            rs.getString("ValorManutencao"),
            rs.getString("ClienteId"),
            rs.getString("PlacaVeiculo")
          );
          manutencaoLista.add(manutencaoItem);
      }
      return new ResponseEntity<>(manutencaoLista.toString(), HttpStatus.OK);
    } catch (SQLException ex) {
      System.out.println("VendorError: " + ex.getErrorCode());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  };

  @PostMapping("/manutencao")
  public String insertClient(@RequestBody Manutencao manutencao) {

    String dataManutencao = manutencao.getDataManutencao();
    String empresaManutencao = manutencao.getEmpresaManutencao();
    String tipoManutencao = manutencao.getTipoManutencao();
    String descricaoManutencao = manutencao.getDescricaoManutencao();
    String valorManutencao = manutencao.getValorManutencao();
    String clienteId = manutencao.getClienteId();
    String placaVeiculo = manutencao.getPlacaVeiculo();

    query = "INSERT INTO MecFrotas.Manutencao (DataManutencao, EmpresaManutencao, TipoManutencao, DescricaoManutencao, ValorManutencao, ClienteId, PlacaVeiculo) VALUES ('" 
    + dataManutencao + 
    "', '" 
    + empresaManutencao + 
    "', '" 
    + tipoManutencao + 
    "', '" 
    + descricaoManutencao + 
    "', '" 
    + valorManutencao + 
    "', '" 
    + clienteId + 
    "', '" 
    + placaVeiculo +
    "')";
    rs = db.query(query);
    return HttpStatus.OK.toString();
  };

  @GetMapping("/motorista")
  public ResponseEntity<String> getMotorista(@RequestParam(required = false) String cpfMotorista) {
    query = "SELECT * FROM MecFrotas.Motorista";

    if (cpfMotorista != null) {
      query += " WHERE CpfMotorista = '" + cpfMotorista + "'";
    };

    rs = db.query(query);
    ArrayList<Motorista> motoristaLista = new ArrayList<Motorista>();
    try {
      while (rs.next()) {
          Motorista motoristaItem = new Motorista(
            rs.getString("CpfMotorista"),
            rs.getString("NomeMotorista"),
            rs.getString("DataNascimentoMotorista"),
            rs.getString("CnhMotorista"),
            rs.getString("ValidadeCnhMotorista"),
            rs.getString("CategoriaCnhMotorista"),
            rs.getString("EstadoMotorista"),
            rs.getString("EnderecoMotorista"),
            rs.getString("CidadeMotorista"),
            rs.getString("BairroMotorista"),
            rs.getString("TelefoneMotorista"),
            rs.getString("EmailMotorista"),
            rs.getString("ExameMedicoMotorista"),
            rs.getString("ClienteID")
          );
          motoristaLista.add(motoristaItem);
      }
      return new ResponseEntity<>(motoristaLista.toString(), HttpStatus.OK);
    } catch (SQLException ex) {
      System.out.println("VendorError: " + ex.getErrorCode());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  };

  @PostMapping("/motorista")
  public String insertMotorista(@RequestBody Motorista motorista) {

    String cpfMotorista = motorista.getCpfMotorista();
    String nomeMotorista = motorista.getNomeMotorista();
    String dataNascimentoMotorista = motorista.getDataNascimentoMotorista();
    String cnhMotorista = motorista.getCnhMotorista();
    String validadeCnhMotorista = motorista.getValidadeCnhMotorista();
    String categoriaCnhMotorista = motorista.getCategoriaCnhMotorista();
    String estadoMotorista = motorista.getEstadoMotorista();
    String enderecoMotorista = motorista.getEnderecoMotorista();
    String cidadeMotorista = motorista.getCidadeMotorista();
    String bairroMotorista = motorista.getBairroMotorista();
    String telefoneMotorista = motorista.getTelefoneMotorista();
    String emailMotorista = motorista.getEmailMotorista();
    String exameMedicoMotorista = motorista.getExameMedicoMotorista();
    String clienteID = motorista.getClienteID();

    query = "INSERT INTO MecFrotas.Motorista VALUES ('" 
    + cpfMotorista + 
    "', '" 
    + nomeMotorista + 
    "', '" 
    + dataNascimentoMotorista + 
    "', '" 
    + cnhMotorista + 
    "', '" 
    + validadeCnhMotorista + 
    "', '" 
    + categoriaCnhMotorista + 
    "', '" 
    + estadoMotorista +
    "', '" 
    + enderecoMotorista +
    "', '" 
    + cidadeMotorista +
    "', '" 
    + bairroMotorista +
    "', '" 
    + telefoneMotorista +
    "', '" 
    + emailMotorista +
    "', '" 
    + exameMedicoMotorista +
    "', '" 
    + clienteID +
    "')";
    rs = db.query(query);
    return HttpStatus.OK.toString();
  };

  @GetMapping("/multa")
  public ResponseEntity<String> getMulta(@RequestParam(required = false) String id) {
    query = "SELECT * FROM MecFrotas.Multa";

    if (id != null) {
      query += " WHERE MultaID = '" + id + "'";
    };

    rs = db.query(query);
    ArrayList<Multa> multaLista = new ArrayList<Multa>();
    try {
      while (rs.next()) {
          Multa multaItem = new Multa(
            rs.getString("ValorMulta"),
            rs.getString("DataMulta"),
            rs.getString("EnderecoMulta"),
            rs.getString("VencimentoPagamentoMulta"),
            rs.getString("DataPagamentoMulta"),
            rs.getString("DescricaoMulta"),
            rs.getString("ClienteId"),
            rs.getString("CpfMotorista"),
            rs.getString("PlacaVeiculo")
          );
          multaLista.add(multaItem);
      }
      return new ResponseEntity<>(multaLista.toString(), HttpStatus.OK);
    } catch (SQLException ex) {
      System.out.println("VendorError: " + ex.getErrorCode());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  };

  @PostMapping("/multa")
  public String insertMulta(@RequestBody Multa multa) {

    String valorMulta = multa.getValorMulta();
    String dataMulta = multa.getDataMulta();
    String enderecoMulta = multa.getEnderecoMulta();
    String vencimentoPagamentoMulta = multa.getVencimentoPagamentoMulta();
    String dataPagamentoMulta = multa.getDataPagamentoMulta();
    String descricaoMulta = multa.getDescricaoMulta();
    String clienteId = multa.getClienteId();
    String cpfMotorista = multa.getCpfMotorista();
    String placaVeiculo = multa.getPlacaVeiculo();

    query = "INSERT INTO MecFrotas.Multa (ValorMulta, DataMulta, EnderecoMulta, VencimentoPagamentoMulta, DataPagamentoMulta, DescricaoMulta, ClienteId, CpfMotorista, PlacaVeiculo) VALUES ('" 
    + valorMulta + 
    "', '" 
    + dataMulta + 
    "', '" 
    + enderecoMulta + 
    "', '" 
    + vencimentoPagamentoMulta + 
    "', '" 
    + dataPagamentoMulta + 
    "', '" 
    + descricaoMulta + 
    "', '" 
    + clienteId +
    "', '" 
    + cpfMotorista +
    "', '" 
    + placaVeiculo +
    "')";
    rs = db.query(query);
    return HttpStatus.OK.toString();
  };

  @GetMapping("/pecas")
  public ResponseEntity<String> getPecas(@RequestParam(required = false) String id) {
    query = "SELECT * FROM MecFrotas.Pecas";

    if (id != null) {
      query += " WHERE PecaID = '" + id + "'";
    };

    rs = db.query(query);
    ArrayList<Pecas> pecasLista = new ArrayList<Pecas>();
    try {
      while (rs.next()) {
          Pecas pecasItem = new Pecas(
            rs.getString("NomePeca"),
            rs.getString("QntdPeca"),
            rs.getString("DescricaoPeca"),
            rs.getString("ValorPeca"),
            rs.getString("ClienteId")
          );
          pecasLista.add(pecasItem);
      }
      return new ResponseEntity<>(pecasLista.toString(), HttpStatus.OK);
    } catch (SQLException ex) {
      System.out.println("VendorError: " + ex.getErrorCode());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  };

  @PostMapping("/pecas")
  public String insertPecas(@RequestBody Pecas pecas) {

    String nomePeca = pecas.getNomePeca();
    String qntdPeca = pecas.getQntdPeca();
    String descricaoPeca = pecas.getDescricaoPeca();
    String valorPeca = pecas.getValorPeca();
    String clienteId = pecas.getClienteId();

    query = "INSERT INTO MecFrotas.Pecas (NomePeca, QntdPeca, DescricaoPeca, ValorPeca, ClienteID) VALUES ('" 
    + nomePeca + 
    "', '" 
    + qntdPeca + 
    "', '" 
    + descricaoPeca + 
    "', '" 
    + valorPeca + 
    "', '" 
    + clienteId + 
    "')";
    rs = db.query(query);
    return HttpStatus.OK.toString();
  };

  @GetMapping("/pneu")
  public ResponseEntity<String> getPneu(@RequestParam(required = false) String id) {
    query = "SELECT * FROM MecFrotas.Pneu";

    if (id != null) {
      query += " WHERE PneuID = '" + id + "'";
    };

    rs = db.query(query);
    ArrayList<Pneu> pneuLista = new ArrayList<Pneu>();
    try {
      while (rs.next()) {
          Pneu pneuItem = new Pneu(
            rs.getString("MarcaPneu"),
            rs.getString("QuilometragemPercorridaPneu"),
            rs.getString("DataPneu"),
            rs.getString("ValorPneu"),
            rs.getString("SituacaoPneu"),
            rs.getString("ClienteId"),
            rs.getString("PlacaVeiculo")
          );
          pneuLista.add(pneuItem);
      }
      return new ResponseEntity<>(pneuLista.toString(), HttpStatus.OK);
    } catch (SQLException ex) {
      System.out.println("VendorError: " + ex.getErrorCode());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  };

  @PostMapping("/pneu")
  public String insertPneu(@RequestBody Pneu pneu) {

    String marcaPneu = pneu.getMarcaPneu();
    String quilometragemPercorridaPneu = pneu.getQuilometragemPercorridaPneu();
    String dataPneu = pneu.getDataPneu();
    String valorPneu = pneu.getValorPneu();
    String situacaoPneu = pneu.getSituacaoPneu();
    String clienteId = pneu.getClienteId();
    String placaVeiculo = pneu.getPlacaVeiculo();

    query = "INSERT INTO MecFrotas.Pneu (MarcaPneu, QuilometragemPercorridaPneu, DataPneu, ValorPneu, SituacaoPneu, ClienteId, PlacaVeiculo) VALUES ('" 
    + marcaPneu + 
    "', '" 
    + quilometragemPercorridaPneu + 
    "', '" 
    + dataPneu + 
    "', '" 
    + valorPneu + 
    "', '" 
    + situacaoPneu + 
    "', '" 
    + clienteId + 
    "', '" 
    + placaVeiculo + 
    "')";
    rs = db.query(query);
    return HttpStatus.OK.toString();
  };

  @GetMapping("/seguro")
  public ResponseEntity<String> getSeguro(@RequestParam(required = false) String apoliceSeguro) {
    query = "SELECT * FROM MecFrotas.Seguro";

    if (apoliceSeguro != null) {
      query += " WHERE ApoliceSeguro = '" + apoliceSeguro + "'";
    };

    System.out.print(query);
    rs = db.query(query);
    ArrayList<Seguro> seguroLista = new ArrayList<Seguro>();
    try {
      while (rs.next()) {
          Seguro seguroItem = new Seguro(
            rs.getString("ApoliceSeguro"),
            rs.getString("TipoSeguro"),
            rs.getString("DataVigenciaSeguro"),
            rs.getString("DataVencimentoSeguro"),
            rs.getString("ValorSeguro"),
            rs.getString("SecuradoraSeguro"),
            rs.getString("CorretorSeguro"),
            rs.getString("TelefoneCorretorSeguro"),
            rs.getString("SituacaoSeguro"),
            rs.getString("ClienteId"),
            rs.getString("PlacaVeiculo")
          );
          seguroLista.add(seguroItem);
      }
      return new ResponseEntity<>(seguroLista.toString(), HttpStatus.OK);
    } catch (SQLException ex) {
      System.out.println("VendorError: " + ex.getErrorCode());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  };

  @PostMapping("/seguro")
  public String insertSeguro(@RequestBody Seguro seguro) {

    String apoliceSeguro = seguro.getApoliceSeguro();
    String tipoSeguro = seguro.getTipoSeguro();
    String dataVigenciaSeguro = seguro.getDataVigenciaSeguro();
    String dataVencimentoSeguro = seguro.getDataVencimentoSeguro();
    String valorSeguro = seguro.getValorSeguro();
    String securadoraSeguro = seguro.getSecuradoraSeguro();
    String corretorSeguro = seguro.getCorretorSeguro();
    String telefoneCorretorSeguro = seguro.getTelefoneCorretorSeguro();
    String situacaoSeguro = seguro.getSituacaoSeguro();
    String clienteId = seguro.getClienteId();
    String placaVeiculo = seguro.getPlacaVeiculo();

    query = "INSERT INTO MecFrotas.Seguro VALUES ('" 
    + apoliceSeguro + 
    "', '" 
    + tipoSeguro + 
    "', '" 
    + dataVigenciaSeguro + 
    "', '" 
    + dataVencimentoSeguro + 
    "', '" 
    + valorSeguro + 
    "', '" 
    + securadoraSeguro + 
    "', '" 
    + corretorSeguro + 
    "', '" 
    + telefoneCorretorSeguro + 
    "', '" 
    + situacaoSeguro + 
    "', '" 
    + clienteId + 
    "', '" 
    + placaVeiculo + 
    "')";
    rs = db.query(query);
    return HttpStatus.OK.toString();
  };

  @GetMapping("/viagem")
  public ResponseEntity<String> getViagem(@RequestParam(required = false) String id) {
    query = "SELECT * FROM MecFrotas.Viagem";

    if (id != null) {
      query += " WHERE ViagemID = '" + id + "'";
    };

    rs = db.query(query);
    ArrayList<Viagem> viagemLista = new ArrayList<Viagem>();
    try {
      while (rs.next()) {
          Viagem viagemItem = new Viagem(
            rs.getString("EstadoInicioViagem"),
            rs.getString("CidadeInicioViagem"),
            rs.getString("DataSaidaViagem"),
            rs.getString("EnderecoInicioViagem"),
            rs.getString("DataChegadaViagem"),
            rs.getString("EstadoDestinoViagem"),
            rs.getString("CidadeDestinoViagem"),
            rs.getString("EnderecoDestinoViagem"),
            rs.getString("DescricaoViagem"),
            rs.getString("QuilometragemFinalVeiculo"),
            rs.getString("ClienteId"),
            rs.getString("CpfMotorista"),
            rs.getString("PlacaVeiculo")
          );
          viagemLista.add(viagemItem);
      }
      return new ResponseEntity<>(viagemLista.toString(), HttpStatus.OK);
    } catch (SQLException ex) {
      System.out.println("VendorError: " + ex.getErrorCode());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  };

  @PostMapping("/viagem")
  public String insertViagem(@RequestBody Viagem viagem) {

    String estadoInicioViagem = viagem.getEstadoInicioViagem();
    String cidadeInicioViagem = viagem.getCidadeInicioViagem();
    String dataSaidaViagem = viagem.getDataSaidaViagem();
    String enderecoInicioViagem = viagem.getEnderecoInicioViagem();
    String dataChegadaViagem = viagem.getDataChegadaViagem();
    String estadoDestinoViagem = viagem.getEstadoDestinoViagem();
    String cidadeDestinoViagem = viagem.getCidadeDestinoViagem();
    String enderecoDestinoViagem = viagem.getEnderecoDestinoViagem();
    String descricaoViagem = viagem.getDescricaoViagem();
    String quilometragemFinalVeiculo = viagem.getQuilometragemFinalVeiculo();
    String clienteId = viagem.getClienteId();
    String cpfMotorista = viagem.getCpfMotorista();
    String placaVeiculo = viagem.getPlacaVeiculo();

    query = "INSERT INTO MecFrotas.Viagem (EstadoInicioViagem, CidadeInicioViagem, DataSaidaViagem, EnderecoInicioViagem, DataChegadaViagem, EstadoDestinoViagem, CidadeDestinoViagem, EnderecoDestinoViagem, DescricaoViagem, QuilometragemFinalVeiculo, ClienteId, CpfMotorista, PlacaVeiculo) VALUES ('" 
    + estadoInicioViagem + 
    "', '" 
    + cidadeInicioViagem + 
    "', '" 
    + dataSaidaViagem + 
    "', '" 
    + enderecoInicioViagem + 
    "', '" 
    + dataChegadaViagem + 
    "', '" 
    + estadoDestinoViagem + 
    "', '" 
    + cidadeDestinoViagem + 
    "', '" 
    + enderecoDestinoViagem + 
    "', '" 
    + descricaoViagem + 
    "', '" 
    + quilometragemFinalVeiculo + 
    "', '" 
    + clienteId + 
    "', '" 
    + cpfMotorista + 
    "', '" 
    + placaVeiculo + 
    "')";
    rs = db.query(query);
    return HttpStatus.OK.toString();
  };
};