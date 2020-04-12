import java.util.*; 
  
public class Dungeon_of_Skulls_Neat{ 
    public static Scanner input = new Scanner(System.in);
    public static Random rand = new Random();
    public static double health = 10;
    public static double strength = 1;
    public static int rute = 0;
    public static int loop = 0;
    public static int loop2 = 0;
    public static String route, pilihan2;
    public static String rute2s = "null";
    public static int bener, bener2, pilihan, rute2 = 0;
    public static double Bosshealth = 1000;
    public static double Damage(){
        double x = Math.random();
        return x;
    }


    public static void main(String args[]) { 

     // Opening
     System.out.println("Selamat datang di Dungeon of Skulls!");
     System.out.println("Kamu adalah seorang penjelajah yang sangat cinta kekayaan,");
     System.out.println("dan kamu menemukan dungeon baru yang terkenal menyimpan banyak rahasia!");
     System.out.println("Mungin dibalik rahasia tersebut ada harta yang melimpah?");
     // Nama
     System.out.print( "Namamu adalah ...\n" );
     String nama = input.nextLine();
     System.out.println("Jelajahilah dungeon tersebut " + nama + "! Dan raih harta yang kamu cari!");
     System.out.println("[Type start to continue]");
     input.next();

     // Start
     System.out.println("Kamu berdiri tepat didepan pintu masuk dungeon, dan kamu menemukan jalan yang bercabang ke empat arah.");
     int jalan = 0;   
     for (jalan = 1; jalan <= 4; jalan++) {
         System.out.println("jalan " + jalan);
        }
     // Route Call
     rute();
     // Finish
     System.out.println("Thanks for playing! Run the program again if you want to play again.");
    } 

    static void rute() {
     System.out.print( "Kamu berada tepat didepan cabang jalan tersebut. Dari keempat jalan, kamu memilih untuk ke rute? \n" );
     rute = input.nextInt(); 
  
        switch (rute) { 
        case 1: 
         RuteSatu();
        break;

        case 2: 
         if (pilihan==0) {
             pilihan = pilihan + 1;
             RuteDua();
            }
            else{
             System.out.println("Kamu tidak berani kembali ke ruangan segila itu! Kamu tidak ingin kembali kesana. Pilih rute lain.");
            }
        break;

        case 3:
         RuteTiga();
        break;

        case 4:
         RuteEmpat();
        break;
            
        default: 
         route = "Masukkan input yang benar!";
         System.out.println("");
         rute();
        } 

 

    } 

    static void RuteSatu() {
        route = "pertama";
        System.out.println("Kamu memilih untuk melewati rute " + route + ".");
        System.out.println("Melewati lorong yang panjang dan suram, kamu akhirnya menemukan ruangan.\nDi ruangan tersebut, berdiri sebuah makhluk hitam tinggi, yang sepertinya tahu dirimu disitu.");
        System.out.println("Makhluk tersebut lansung sergap lari sangat cepat kearah dirimu, siap untuk menyerang.\nKaget dan kurang siap, kamu :. . .");
        System.out.println("1. Melawan dia balik secara lansung.\n2. Menghindar terlebih dahulu kemudian serang dari belakang.\n3. Mencoba menangkis serangan makhluk tersebut.\n[Masukkan input]");

        bener = 0;
        pilihan = 0;
        while (bener == 0) {
            pilihan = input.nextInt();
            if (pilihan == 1) {
                bener = 1;
                System.out.println("Kamu mencoba untuk melawan makhluk tersebut secara lansung, tetapi makhluk tersebut jauh lebih cepat dari dirimu.\nKetika kamu menebas pedangmu kearahmya, tangan makhluk tersebut sudah sampai ke bagian badanmu, mencabiknya menjadi dua.");
                System.out.println("Mayatmu terkulai lemas, terpisah dua bagian di ruangan tersebut. . .");
                Mati();
               } 
            else {
                if (pilihan == 2) {
                    RuteSatuSatu();  
                   } 
                else {
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
                       } 
                    else {
                        System.out.println("inputmu salah!");
                       }
                    }
                }
            }
    }
    static void RuteSatuSatu(){
        bener = 1;
        System.out.println("Seketika kamu tahu bahwa tangan makhluk itu akan sampai duluan ke tubuhmu, maka kamu menghindar dari serangannya.\nUntungnya, makhluk tersebut sedikit lambat untuk mengetahuinya, dalam oportunitas tersebut kamu menebasnya dari blakang.");
        System.out.println("Makhluk tersebut meraung kesakitan, dan pada saat itu juga, kamu akhiri hidup makhluk tersebut dengan cepat");
        System.out.println("Makhluk tersebut terkulai lemas, tak berdaya dan tak bernyawa. . .\nKamu mencoba untuk menjelajah ruangan tersebut sebelum melanjutkan perjalanan");
        System.out.println("Di ruangan tersebut kamu menemukan liontin, waktu kamu mengenakan liontin tersebut kamu merasa lebih kuat!\n[strength+1]");
        strength = strength+1;
        System.out.println("Kamu melanjutkan perjalananmu, melewati belokan dan jalan buntu. Akhirnya, kamu menemukan jalan bercabang lagi.");
        bener = 0;
        bener2 = 0;


            while (bener == 0){
            System.out.println("Kamu memilih untuk melanjutkan kearah...");
            rute2s = input.nextLine();
            switch (rute2s) {
                case "kiri":
                   if (bener2 == 0){
                    bener2 = 1;
                    pilihan = 0;
                    System.out.println("Kamu menyusuri lorong kiri, dan kamu menemukan jalan buntu dengan harta karun!");
                    System.out.println("Apakah kamu ingin membuka harta karunnya?");
                    System.out.println("[iya/tidak]");
                    while (pilihan == 0){
                    pilihan2 = input.nextLine();
                    switch (pilihan2) {
                       case "iya":
                           pilihan = 1;
                           System.out.println("Kamu membuka harta karun tersebut. Tidak banyak isinya selain beberapa keping koin dan sebagainya.\nSalah satu diantaranya kamu menemukan botol kaca berisi cairan merah yang aneh.");
                           System.out.println("Setelah membuka botol tersebut, kamu memberanikan dirimu untuk minum cairan tersebut. Kamu merasa lebih sehat!");
                           System.out.println("[Nyawamu bertambah]");
                           health = health + 5;
                           System.out.println("Nyawamu : " + health);
                           System.out.println("Setelah mengambil semua barang di kotak tersebut, kamu kembali ke awal jalan masuk lorong tersebut.");
                       break;

                       case "tidak":
                           pilihan = 1;
                           System.out.println("Walaupun penasaran, kamu terlalu takut jika didalamnya ada perangkap. Kamu balik badan dan melanjutkan perjalananmu.");
                       break;
                       default:
                       System.out.println("[Masukkan input iya atau tidak!]");
                    }
                    }
                   }
                   else{
                    System.out.println("Kamu sudah menjelajahi cabang ini! Jalan buntu!")  ;
                   }
                    break;

                case "kanan":
                       bener = 1;
                       System.out.println("Kamu memilih untuk menjelajahi lorong kanan, dan yang pertama kali kamu rasakan setelah memasuki lorong ini adalah teror.\nDirimu sangat menolak untuk berjalan, tetapi perjalanan kamu sudah sejauh ini.");
                       System.out.println("Kamu mencoba untuk mengumpulkan segelintir keberanian yang ada pada dirimu, dan melanjutkan perjalananmu.");
                       System.out.println("Menyusuri lorong tersebut, badanmu terasa sangat berat. Tetapi dengan penuh tekad dan nyali, akhirnya kamu menemukan jalan keluar.");
                       Boss();
                       break;

                   default:
                       System.out.println("[Masukkan kiri atau kanan!]");
               }
            }
    }
    static void RuteDua(){
        route = "kedua"; 
        System.out.println("Kamu memilih untuk melewati rute " + route + ".");
        System.out.println("Melewati rute yang gelap, kamu tidak tahu kamu berada dimana... ");
        System.out.println("Akhirnya, kamu menemukan sumber cahaya dari ujung lorong tersebut.\nKamu mengikuti sumber cahaya tersebut sampai kamu menemukan ruangan yang sangat besar, walaupun ruangannya redup, tetapi lebih terang dibanding lorong yang gelap gulita tadi.\nSeketika obor di ruangan tersebut menyala satu persatu.");
        System.out.println("Pelan pelan, isi dari ruangan tersebut terlihat... Keringat dari tubuhmu menetes...");
        System.out.println("Belasan...tidak, puluhan monster kadal memenuhi ruangan tersebut. Mata mereka seperti sudah fokus untuk menerkam dirimu.");
        System.out.println("Kamu tidak memiliki banyak pilihan... Kamu :");
        System.out.println("1.Balik badan dan melarikan diri, dirimu merasa ini terlalu berlebihan.\n2. Mencoba untuk lari lansung ke pintu keluar selanjutnya, mungkin kadal tersebut tidak bisa mengejarmu.");
        System.out.println("3. Mencoba untuk melindungi dirimu lansung kearah jalan keluar.\n4. Mencoba untuk melawan semua kadal ini sampai habis!");
        System.out.println("[Masukkan inputmu]");
        bener = 0;
        rute2 = input.nextInt();
        while (bener == 0){
         switch (rute2) {
            case 1:
             bener = bener + 1;
             System.out.println("Ketakutan dan panik, kamu melarikan diri balik ke pintu utama, mengingat bahwa ada cabang jalan lain. 'Tidak mungkin aku bisa melawan sebanyak itu!' pikir dirimu.\nKamu tidak ingin kembali ke ruangan itu lagi...");
             rute();
            break;

            case 2:
             bener = bener + 1;
             System.out.println("Kamu merasa dirimu cukup cepat untuk meninggalkan kadal-kadal ini. Kamu meyiapkan ancang ancang, dan lansung meluncur menuju pintu keluar!");
             try {
                Thread.sleep(1500);
             } catch (InterruptedException e) {
                  e.printStackTrace();
                }
             System.out.println("...Yang ternyata kenyataannya benar-benar terbalik...");
             System.out.println("Pertama. Walaupun dirimu cepat, ternyata kadal ini dapat melata dengan kecepatan yang tidak bisa diabaikan. Tidak sengaja kamu merasa kakimu diterkam salah satu kadal tersebut.\nKedua, kadal ini berbisa! Kakimu tidak lama merasa sangat kaku dan membuat kamu terjatuh...");
             System.out.println("Lama-lama, rasa kaku tersebut menyebar ke seluruh tubuhmu. Kamu mencoba untuk mengusir kadal-kadal ini tetapi saraf dirimu mati rasa.\nHal yang terakhir kamu liat adalah puluhan kadal yang terlihat seperti mereka belum makan sejak sekian lamanya...");
             Mati();
            break;

            case 3:
             bener = bener + 1;
             RuteDuaSatu();
            break;

            case 4:
            bener = bener + 1;
            RuteDuaDua();
            break;

            default:
             System.out.println("Masukkan input yang benar! (1-4)");
         }
        }

        
    }

    static void RuteDuaSatu(){
        System.out.println("Kamu menarik pedangmu. Walaupun takut tetapi kamu percaya kamu dapat melewati ini. Dengan sigap dan hati-hati kamu segera berlari kearah pintu keluar.");
        System.out.println("Setiap kadal yang melompat untuk menerkam dirimu kamu tebas tanpa ampun. Beberapa ada yang mati, tetapi banyak yang hanya terpental begitu saja. Itu bukan kepentinganmu, kepentingan dirimu adalah keselamatan");
        System.out.println("Saking banyaknya monster di ruangan tersebut, sedikit tidak mungkin untuk dirimu dapat berhasil selamat tanpa luka. Hanya sebagian yang dapat kamu tangkis tetapi beberapa masih dapat berhasil menggigit tubuhmu.");
        System.out.println("Satu hal yang kamu baru tahu adalah, monster ini ternyata berbisa. Kamu merasa dirimu pelan-pelan merasa kaku.");
    }

    static void RuteDuaDua(){
        System.out.println("[PLACEHOLDER]Lawan monster, satu-satu, kena serang, semua mati, mau pingsan, tiba tiba ada setan, nawarin pilihan, mati disini juga, atau tanda-tangan kontrak dia, kalo mati ya mati, kalo iya nanti dikasih kekuatan berlebih.");
    }
    static void RuteTiga(){
        route = "ketiga"; 
        System.out.println("Kamu memilih untuk melewati rute " + route + ".");
        System.out.println("Kamu diberikan pilihan untuk melewati lorong gelap atau terang");
        System.out.println("Karena ini pertarungan pertamamu, kamu memilih lorong yang terang.\nDiujung lorong kamu melihat sebuah pintu yang terlihat normal.\nKamu mencoba membuka pintu itu dan berfikiran pintu itu akan membawamu ke sisi Tuhan atau kamu mengetahui mekanisme untuk menutupnya.");
        System.out.println("Tetapi.. Ternyata pintu itu benar-benar biasa. Hanya saja kamu terlalu banyak berimajinasi dan berfikie yang aneh-aneh.");
        System.out.println("Di dalamnya kamu melihat 7 item yang tergeletak. Pada dinding ruangan tersebut tertuliskan 'Ambillah satu barang untuk kamu simpan selamanya'.");
        System.out.println("Kamu memilih untuk mengambil : ");
        System.out.println("1. Kotak harta karun berlapis Emas.\n2. Kotak harta karun biasa.\n3. Berlian terbesar yang kamu lihat.\n4. Tas ransel lusuh.\n5. Sebuah gulir yang memiliki segel kerajaan.");
        System.out.println("6. Ramuan hijau dengan butiran-butiran kecil di dalamnya.\n7. Pedang sakti yang ketajamannya 7 kali 5 samadengan 35.");
        System.out.println("[Masukkan Inputmu]");
        bener = 0;
        pilihan = 0;
        pilihan = input.nextInt();
        switch (pilihan){
            case 1 :
                RuteTigaSatu();
            case 2 :
                bener = 1;
                System.out.println("Kamu membuka kotak biasa tersebut. Ketika kamu membukanya, kotak tersebut ternyata berubah menjadi moster yang sangat berbahaya.\nKamu digigit oleh moster tersebut. Lalu terdampar dengan badan menjadi biru.");
                Mati();
            case 3 :
                RuteTigaDua();
            case 4 :
                RuteTigaTiga();
            case 5 :
                RuteTigaEmpat();
            case 6 :
                RuteTigaLima();
            case 7 :
                RuteTigaEnam();
            
            default :
                System.out.println("Masukkan input yang benar! (1-4)");
        }
    }
    static void RuteTigaSatu(){
        bener = 1;
        System.out.println("Kamu membuka kotak emas tersebut dan mendapati di dalamnya banyak sekali harta. Harta tersebut kamu ambil semua hingga tidak bersisa.");
        System.out.println("Ketika sudah terambil semua kamu melihat ada tombol kecil di dasar kotak tersebut.\nKamu penasaran dan akhirnya menekan tombol itu dan tiba-tiba terdengar suara gerbang yang terbuka lalu kamu menghampiri suara tersebut.");
        System.out.println("Suara tersebut mengarah ke sebuah pintu berwarna emas. Kamu dengan bahagianya mengira pintu tersebut adalah pintu keluar lalu kamu membuka pintu tersebut.");
        System.out.println("Seperti perkiraanmu pintu benar-benar menunjukkan jalan keluar. Kamu-pun bergegas untuk keluar melewati pintu itu dengan membawa harta yang kamu ambil dari kotak harta karun tadi.");
        System.out.println("Setelah berjalan beberapa meter tiba-tiba terdengar suara motor RX-King mendekat. Benar saja, motor itu ternyata adalah begal dengan senjata yang sangat modern lagi canggih. Kamu berencana untuk melawannya dengan senjatamu.");
        System.out.println("Naasnya, senjatamu kalah canggih. Dalam sekejap kamu tergeletak lemas dengan hartamu dibawa oleh begal tersrbut.");
        Mati();
    }
    static void RuteTigaDua(){
        bener = 1;
        System.out.println("Kamu mengambil berlian tersebut dan kamu bawa.\nKetika kamu mengambilnya tiba-tiba ada goncangan dasyat di dalam ruangan tesebut.\nSatu demi satu puing-puing berjatuhan.");
        System.out.println("Kamu panik dan akhirnya kamu lari sambil membawa berlian tersebut.\nKapanikanmu membuatmu gegabah dan melangkah tanpa arah.\nKamu tersandung dan jatuh, berlian yang ada pada mu juga terlempar jauh dari jangkauanmu.");
        System.out.println("Tiba-tiba puing berukuean besar jatuh tepat di kakimu, sehingga kamu tidak bisa bergerak.\nDari atas muncul seekor moster raksasa yang mana itu adalah penjaga berlian tersebut.");
        System.out.println("Moster itu melihat mu dan langsung menghancurkan tubuhmu berkeping-keping.");
        Mati();
        
    }
    static void RuteTigaTiga(){
        bener = 1;
        System.out.println("Kamu mengambil tas itu dan membukanya.\nTidak disangka tas selusuh itu dalamnya adalah baju zirah yang kuat.\nKamu memakai baju zirah tersebut dan kamu merasa kekuatanmu bertambah.\n[strength+1]");
        strength=strength+1;
        System.out.println("Ketika kamu memakai baju tersebut, muncul sinar dari bagian dada yang menyorot kesuatu lubang.\nSinar itu menyebabkan terbukanya pintu Ghaib yang sebelumnya kamu tidak mengetahui keberadaannya.");
        System.out.println("Kamu masuk ke dalam pintu itu dan melanjutkan perjalanan.\nLorong demi lorong terus kamu telusuri hingga sampai ke suatu tempat yang mana itu adalah jalan keluar.");
        Boss();
    }
    static void RuteTigaEmpat(){
        bener = 1;
        System.out.println("Kamu mengambil gulir tersebut dan membukanya.\nGulir tersebut berisi tulisan yang aneh, kamu mencoba membolak-balikkan dan menebak apa makna dari tulisan tersebut.\nTanpa pikir panjang kamu langsung membacanya.");
        System.out.println("Selesai kamu baca, tiba-tiba kamu mendengar suara misterius yang entah dari mana datangnya.\nSuara itu membuatmu yakin dan kamupun mengikuti suara tersebut.\nSuara tersebut membawamu ke suatu ruangan yang sangat luas.");
        System.out.println("Ketika kamu sampai di ruangan tersebut, kamu disambut oleh kuda bersayap berwarna putih.\nSuara itu mengisyaratkan bahwa kuda itu menjadi milikmu. Kamupun langsung menungganginya.");
        System.out.println("Dengan menunggangi kuda tersebut kamu merasa tubuhmu lebih kuat dari sebelumnya.\n[strength+1]");
        strength=strength+1;
        System.out.println("Kamupun melanjutkan perjalananmu dengan menunggangi kuda tersebut hingga samapai ke suatu pintu yang mana pintu itu adalah jalan keluar.");
        Boss();
    }
    static void RuteTigaLima(){
        bener = 1;
        System.out.println("Kamu meminum ramuan itu sampai habis. Kemudian selang beberapa menit kamu mulai mengantuk.\nDengan kondisi mengantuk berat kamu melihat ada pintu di depanmu dan kamupun membuka serta memasukinya.");
        System.out.println("Tidak disangka ternyata pintu tersbut adalah jelmaan Makhluk yang tinggi besar dengan mulut yang sangat lebar hingga terlihat seperti pintu.\nKamu termakan oleh moster tersebut. Badanmu hancur tak bersisa.");
        Mati();
    }
    static void RuteTigaEnam(){
        bener = 1;
        System.out.println("Kamu membawa pedang sakti yang sangat tajam.\nKamu merasa kekuatanmu bertambah kuat.\n[strength+1]");
        strength=strength+1;
        System.out.println("Ketika kamu memegang pedang tersebut, keluar cahaya dari pedang itu masuk ke suatu lubang.\nTerbukalah suatu pintu yang kamu tidak menyadari keberadaannya sebelumnya.");
        System.out.println("Kamu masuk ke dalam pintu tersebut dan melanjutkan perjalanan.\nMenyusuri lorong yang sangat panjang dan pada akhirnya kamu menemukan jalan keluar.");
        Boss();
    }
    static void RuteEmpat(){
        route = "keempat"; 
        System.out.println("Kamu memilih untuk melewati rute " + route + ".");
    }
    static void Boss(){
     System.out.println("Kamu sampai di suatu goa raksasa, dengan cahaya obor yang redup menerangi goa tersebut.\nKamu merasa suatu keberadaan yang menyeramkan di goa tersebut...");
     System.out.println("Seketika tanah bergemuruh, seperti pijakan kaki sesuatu yang sangat besar. Kamu tidak mengantisipasi hal ini sama sekali...");
     System.out.println("Tidak jauh dari dirimu, datang sebuah monster raksasa. Sebuah tengkorak raksasa lengkap dengan perisai dan tameng.");
     System.out.println("Mungkin ini adalah pertarungan yang tidak bisa dihindarkan...");
     System.out.println("[Battle start!]");
     System.out.println("[Serang boss tersebut dengan mengetik 'serang' berkali kali sampai boss tersebut kalah!]");
     loop = 0;
     while (loop == 0) {
         if (Bosshealth <= 0) {
             if (health > 0) {
                Win();
                loop = 1;
            }
             else {
                 System.out.println("Badanmu terkulai lemah, dan tidak memiliki energi lagi. Kamu melihat kearah monster tersebut, dan kamu melihat monsternya runtuh ambruk.\nKamu berhasil melawan boss tersebut tetapi tubuhmu sudah sangat rapuh...");
                 System.out.println("Kamu menjatuhkan tubuhmu ke tanah, terkulai lemas. Kamu tersenyum dengan genggaman tanganmu melepaskan pedangmu secara perlahan...");
                 Mati();
                 loop = 1;
            }
        }
         else {
             if (health > 0) {
                 Bossfight();
            } 
            else {
                 System.out.println("Tubuhmu sudah sangat lemah untuk tetap menerima serangan selanjutnya dari monster tersebut.\nKamu mencoba untuk menangkis kembali serangan dari monster itu, tetapi dengan tidak ada tenaga, badanmu dengan mudah terlempar jauh.");
                 System.out.println("Terkulai lemas, kamu dengan mudah dihabiskan oleh monster tersebut dan kamu tidak bisa melakukan apa apa...");
                 Mati();
                 loop = 1;
                }
            }
        }

    }
    static void Bossfight(){
     loop2 = 0;
     while (loop2 == 0) {
         String serang = input.nextLine();
         switch (serang) {
             case "serang":
             health = health - 1;
             System.out.println("Kamu terserang!\nNyawamu : " + health);
             Bosshealth = Bosshealth -(Damage() * strength * 100);
             System.out.println("Kamu menyerang! Nyawa boss tersebut sisa : " + Math.round(Bosshealth));
             loop2 = 1;
            break;
             default:
            System.out.println("[Masukkan input serang!]");
            }
        }
    }
    static void Mati() {
     try {
         Thread.sleep(1000);
        }
     catch (InterruptedException e) {
         e.printStackTrace();
        }
     System.out.println("Kamu mati!\nSayang sekali hidupmu sebagai penjelajah berakhir sampai sini...");
     try {
         Thread.sleep(500);
        }
     catch (InterruptedException e) {
            e.printStackTrace();
        }
     System.out.println("Mungkin selanjutnya harus lebih hati-hati lagi. . .");
     System.out.println("Coba untuk jelajahi jalan yang belum kamu pilih, mungkin kamu akan menemukan sesuatu...");
    }
    static void Win() {
     System.out.println("yey");
    }
    
} 
