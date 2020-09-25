package javafuncional.threads;

public class ThreadExemplo {
	public static void main(String[] args) {
		GeradorDePdf pdf = new GeradorDePdf();
		BarraDeProgresso barra = new BarraDeProgresso(pdf);
		
		pdf.start();
		barra.start();
	}
}

class GeradorDePdf extends Thread{

	@Override
	public void run() {
		System.out.println("Iniciar geração de Pdf");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("PDF gerado!");
	}
	
}

class BarraDeProgresso extends Thread{
	private Thread pdf;
	
	public BarraDeProgresso(Thread gerarPdf) {
		this.pdf = gerarPdf;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(500);
				if(!pdf.isAlive()) {
					break;
				}
				System.out.println("Loading...");
			}
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
	
}

class BarraDeProgresso2 implements Runnable{
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Rodei a barra de carregamento 2 ");
	}
}
class BarraDeProgresso3 implements Runnable{
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Rodei a barra de carregamento 3 ");
	}
}	