import java.util.*; 
  
public class tugas1{ 
  
    public static Scanner input = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String args[]) { 
        // Generate random integers in range 0 to 999 
        int attack = rand.nextInt(1000);
        // Indikator
        double health = 10;
        double damage = 1;
        // Opening
        System.out.println("Selamat datang di Dungeon of Skulls!");
        System.out.println("Kamu adalah seorang penjelajah yang sangat cinta kekayaan,");
        System.out.println("dan kamu menemukan dungeon baru yang terkenal menyimpan banyak rahasia!");
        System.out.println("Mungin dibalik rahasia tersebut ada harta yang melimpah?");

        System.out.print( "Namamu adalah ...\n" );
        String nama = input.nextLine();


        System.out.println("Jelajahilah dungeon tersebut " + nama + "! Dan raih harta yang kamu cari!");
        System.out.println("[Type start to continue]");
        input.next();

        // Start
             System.out.println("Kamu berdiri tepat didepan pintu masuk dungeon, dan kamu menemukan jalan yang bercabang ke empat arah.");
             int jalan;
                
             jalan = 0;
             for (jalan = 1; jalan <= 4; jalan++) {
                System.out.println("jalan " + jalan);
             }
             rute();

        // Print random integers 
        System.out.println("Damage : " + attack * damage);
        System.out.println("Health : " + (health-(attack * damage)));
    


        System.out.println("Thanks for playing! Run the program again if you want to play again.");
    } 

    static void rute() {
        double health = 10;
        double damage = 1;
        System.out.print( "Kamu memilih untuk ke rute? \n" );
        int rute = 0;
        rute = input.nextInt();


        String route; 
  
        switch (rute) { 
        case 1: 
            route = "pertama";
             System.out.println("Kamu memilih untuk melewati rute " + route + ".");
             System.out.println("Melewati lorong yang panjang dan suram, kamu akhirnya menemukan ruangan.\nDi ruangan tersebut, berdiri sebuah makhluk hitam tinggi, yang sepertinya tahu dirimu disitu.");
             System.out.println("Makhluk tersebut lansung sergap lari sangat cepat kearah dirimu, siap untuk menyerang.\nKaget dan kurang siap, kamu :. . .");
             System.out.println("1. Melawan dia balik secara lansung.\n2. Menghindar terlebih dahulu kemudian serang dari belakang.\n3. Mencoba menangkis serangan makhluk tersebut.\n[Masukkan input]");
             int pilihan, bener, bener2;
        
             bener = 0;
             pilihan = 0;
             while (bener == 0) {
                 pilihan = input.nextInt();
                 if (pilihan == 1) {
                     bener = 1;
                     System.out.println("Kamu mencoba untuk melawan makhluk tersebut secara lansung, tetapi makhluk tersebut jauh lebih cepat dari dirimu.\nKetika kamu menebas pedangmu kearahmya, tangan makhluk tersebut sudah sampai ke bagian badanmu, mencabiknya menjadi dua.");
                     System.out.println("Mayatmu terkulai lemas, terpisah dua bagian di ruangan tersebut. . .");
                     Mati();
                    } else {
                     if (pilihan == 2) {
                         bener = 1;
                         System.out.println("Seketika kamu tahu bahwa tangan makhluk itu akan sampai duluan ke tubuhmu, maka kamu menghindar dari serangannya.\nUntungnya, makhluk tersebut sedikit lambat untuk mengetahuinya, dalam oportunitas tersebut kamu menebasnya dari blakang.");
                         System.out.println("Makhluk tersebut meraung kesakitan, dan pada saat itu juga, kamu akhiri hidup makhluk tersebut dengan cepat");
                         System.out.println("Makhluk tersebut terkulai lemas, tak berdaya dan tak bernyawa. . .\nKamu mencoba untuk menjelajah ruangan tersebut sebelum melanjutkan perjalanan");
                         System.out.println("Di ruangan tersebut kamu menemukan liontin, waktu kamu mengenakan liontin tersebut kamu merasa lebih kuat!\n[Damage+1]");
                         damage = damage+1;
                         System.out.println("Kamu melanjutkan perjalananmu, melewati belokan dan jalan buntu. Akhirnya, kamu menemukan jalan bercabang lagi, kamu memilih ke arah...");
                         bener = 0;
                         bener2 = 0;
                         pilihan = 0;
                         while (bener == 0){
                         String rute2 = "null";
                         rute2 = input.nextLine();
                         switch (rute2) {
                             case "kiri":
                                if (bener2 == 0){
                                 bener2 = 1;
                                 System.out.println("Kamu menyusuri lorong kiri, dan kamu menemukan jalan buntu dengan harta karun!");
                                 System.out.println("Apakah kamu ingin membuka harta karunnya?");
                                 System.out.println("[ya/tidak]");
                                }
                                else{
                                 System.out.println("Kamu sudah menjelajahi cabang ini! Jalan buntu!")  ;
                                }
                                 break;

                                case "kanan":
                                    bener = 1;
                                    System.out.println("yey");
                                    break;

                                default:
                                    System.out.println("[Masukkan kiri atau kanan!]");
                            }
                         }
                        
                         

                         

                     } else {
                         if (pilihan == 3) {
                             bener = 1;
                             System.out.println("Kamu mencoba untuk menangkis serangan makhluk itu menggunakan pedangmu. Tetapi tebasan tangan makhluk tersebut terlalu kuat untuk kamu tahan.\nDirimu terlempar jauh, menabrak dinding. Kamu merintih kesakitan.");
                             System.out.println("Kamu merasa tidak kuat untuk melawan untuk melawan makhluk itu sehingga kamu melarikan diri dan melanjutkan penjelajahanmu");
                             try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Sayangnya monster itu mengejarmu dan badanmu lansung tercabik tanpa ampun!");
                            Mati();
                             
                         } else {
                             System.out.println("inputmu salah!");
                         }
                     }
                 }
             }
             break; 
        case 2: 
            route = "kedua"; 
            break; 
        case 3: 
            route = "ketiga"; 
            break; 
        case 4: 
            route = "keempat"; 
            break; 
        default: 
            route = "Masukkan input yang benar!";
            System.out.println("");
            rute();
        } 

 

    } 

    static void Mati() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Kamu mati!\nSayang sekali hidupmu sebagai penjelajah berakhir sampai sini...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Mungkin selanjutnya harus lebih hati-hati lagi. . .");
    }
    
} 