package dio.web.api.handler;

public class CampoObrigatorioExpection extends BusinessException{
    public CampoObrigatorioExpection(String campo) {
        super("O campo %s é  obrigatório", campo);
    }

}
