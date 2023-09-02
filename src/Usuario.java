public class Usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV ligada? "+smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status -> TV ligada? "+smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume atual: "+smartTv.volume);

        smartTv.baixarVolume();
        System.out.println("Novo Status -> Volume atual: "+smartTv.volume);

        smartTv.subirCanal();
        System.out.println("Novo Status -> Canal atual: "+smartTv.canal);

        smartTv.baixarCanal();
        System.out.println("Novo Status -> Canal atual: "+smartTv.canal);

        smartTv.mudarcanal(26);
        System.out.println("Novo Status -> Canal atual: "+smartTv.canal);
    }
}
