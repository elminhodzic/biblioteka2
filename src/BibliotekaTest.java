
import java.util.Scanner;

public class BibliotekaTest {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		Biblioteka b = new Biblioteka();

		int opcija = 1;
		int brojRacuna, brojKnjige;

		while (opcija != 0) {
			System.out.println();
			System.out.println("Izaberite jednu od opcija: ");
			System.out.println(
					"1. Kreiraj racun\n2. Kreiraj knjigu\n3. Podigni knjigu\n4. Vrati knjigu\n5. Ispis racuna\n6. Ispis knjia\n0. Izlaz");

			opcija = unos.nextInt();

			if (opcija == 1) {

				System.out.println("Unesite broj racuna: ");
				brojRacuna = unos.nextInt();

				unos.nextLine();

				System.out.println("Unesite ime korisnika");
				String ime = unos.nextLine();

				b.kreirajRacun(brojRacuna, ime);
			}
			if (opcija == 2) {

				System.out.println("Unesite broj knjige: ");
				brojKnjige = unos.nextInt();

				unos.nextLine();

				System.out.println("Unesite ime knjige: ");
				String imeKnjige = unos.nextLine();

				b.kreirajKnjigu(brojKnjige, imeKnjige);

			}

			if (opcija == 3) {

				System.out.println("Unesite broj racuna: ");
				brojRacuna = unos.nextInt();

				unos.nextLine();

				System.out.println("Unesite broj knjige");
				brojKnjige = unos.nextInt();

				b.podigniKnjigu(brojRacuna, brojKnjige);

			}

			if (opcija == 4) {

				System.out.println("Unesite broj racuna: ");
				brojRacuna = unos.nextInt();

				unos.nextLine();

				System.out.println("Unesite broj knjige");
				brojKnjige = unos.nextInt();

				b.vratiKnjigu(brojRacuna, brojKnjige);

			}

			if (opcija == 5) {
				System.out.println("Detalji o postojecim racunima: ");
				b.ispisDetaljaORacunima();

			}

			if (opcija == 6) {
				System.out.println("Detalji o postoje�im knjigama: ");
				b.ispisDetaljaOKnjigama();

			}
			if (opcija == 0) {
				System.exit(0);
			}
		}
		unos.close();
	}

}