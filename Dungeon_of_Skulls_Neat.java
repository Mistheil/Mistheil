import java.util.*; 
  
public class Dungeon_of_Skulls_Neat{ 
    public static Scanner input = new Scanner(System.in);
    public static Random rand = new Random();
    public static double health = 10;
    public static double strength = 1;
    public static String rute = "0";
    public static int loop = 0;
    public static int loop2 = 0;
    public static String route, pilihan2;
    public static String rute2s = "null";
    public static int bener, bener2, pilihan, rute2, janji = 0;
    public static double Bosshealth = 1000;
    public static double Damage = 0;
    public static double Dmg(){
        double x = Math.random();
        return x;
    }
 
    //Jeda text
    static void jeda1(){
        try {
            Thread.sleep(1000);
           }
        catch (InterruptedException e) {
               e.printStackTrace();
           }
    }
    static void jeda05(){
        try {
            Thread.sleep(500);
           }
        catch (InterruptedException e) {
               e.printStackTrace();
           }
    }

    public static void main(String args[]) { 

     // Opening
     System.out.println("Selamat datang di Dungeon of Skulls!");     jeda05();
     System.out.println("Kamu adalah seorang penjelajah yang sangat cinta kekayaan,");     jeda05();
     System.out.println("dan kamu menemukan dungeon baru yang terkenal menyimpan banyak rahasia!");     jeda05();
     System.out.println("Mungin dibalik rahasia tersebut ada harta yang melimpah?");     jeda05();
     // Nama
     System.out.print( "Namamu adalah ...\n" );
     String nama = input.nextLine();
     System.out.println("Jelajahilah dungeon tersebut " + nama + "! Dan raih harta yang kamu cari!");     jeda05();
     System.out.println("[Type start to continue]");
     input.next();
     Start();
    }

     // Start
     static void Start(){
     health = 10;
     strength = 1;
     pilihan = 0;
     janji = 0;
     System.out.println("Kamu berdiri tepat didepan pintu masuk dungeon, dan kamu menemukan jalan yang bercabang ke empat arah.");     jeda05();
     int jalan = 0;   
     for (jalan = 1; jalan <= 4; jalan++) {
         System.out.println("jalan " + jalan);
         jeda05();
        }
     // Route Call
     rute();

     //Replay?
     System.out.println("Game Over!");     jeda05();
     System.out.println("Apakah kamu ingin mencoba lagi? [ya/tidak]");
     rute2s = "null";
     bener = 0;
     while (bener==0){
      rute2s = input.next()+ input.nextLine();
      switch (rute2s) {
            case "ya":
             bener = 1;
             System.out.println("Restarting...\n.\n.\n.\n.\n.");
             try {
                Thread.sleep(3000);
               }
            catch (InterruptedException e) {
                   e.printStackTrace();
               }
             Start();
            break;

            case "tidak":
             bener = 1;
            break;

            default:
            System.out.println("[Masukkan input dengan benar!(ya/tidak)]");
        }
    }

     // Finish
     System.out.println("Thanks for playing! Run the program again if you want to play again.");
    } 


    static void rute() {
     System.out.print( "Kamu berada tepat didepan cabang jalan tersebut. Dari keempat jalan, kamu memilih untuk ke rute? \n" ); jeda05();
     System.out.println("[Masukkan input angka 1-4]");
     rute = input.next()+ input.nextLine();
  
        switch (rute) { 
        case "1": 
         RuteSatu();
        break;

        case "2": 
         if (pilihan==0) {
             pilihan = pilihan + 1;
             RuteDua();
            }
            else{
             jeda05();
             System.out.println("Kamu tidak berani kembali ke ruangan segila itu! Kamu tidak ingin kembali kesana. Pilih rute lain.");
             rute();
            }
        break;

        case "3":
         RuteTiga();
        break;

        case "4":
         RuteEmpat();
        break;
            
        default: 
         route = "Masukkan input yang benar! [1-4]";
         System.out.println(route);
         rute();
        } 

 

    } 

    static void RuteSatu() {
        route = "pertama";
        System.out.println("Kamu memilih untuk melewati rute " + route + "."); jeda05();
        System.out.println("Melewati lorong yang panjang dan suram, kamu akhirnya menemukan ruangan.");
        System.out.println("Di ruangan tersebut, berdiri sebuah makhluk hitam tinggi, yang sepertinya tahu dirimu disitu.");
        System.out.println("Makhluk tersebut lansung sergap lari sangat cepat kearah dirimu, siap untuk menyerang.\nKaget dan kurang siap, kamu :. . .");
        System.out.println("1. Melawan dia balik secara lansung.");
        System.out.println("2. Menghindar terlebih dahulu kemudian serang dari belakang."); jeda05();
        System.out.println("3. Mencoba menangkis serangan makhluk tersebut."); jeda05();
        System.out.println("[Masukkan input]");
        bener = 0;
        pilihan = 0;
        rute = "null";
        while (bener == 0) {
            rute = input.next()+ input.nextLine();
            if (rute == "1") {
                bener = 1;
                System.out.println("Kamu mencoba untuk melawan makhluk tersebut secara lansung, tetapi makhluk tersebut jauh lebih cepat dari dirimu."); jeda05();
                System.out.println("Ketika kamu menebas pedangmu kearahmya, tangan makhluk tersebut sudah sampai ke bagian badanmu, mencabiknya menjadi dua."); jeda05();
                System.out.println("Mayatmu terkulai lemas, terpisah dua bagian di ruangan tersebut. . ."); jeda05();
                Mati();
               } 
            else {
                if (rute == "2") {
                    RuteSatuSatu();  
                   } 
                else {
                    if (rute == "3") {
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
                        System.out.println("inputmu salah! Masukkan input 1-3!");
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
            rute2s = input.next()+ input.nextLine();
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
        System.out.println("Seiring badanmu yang bertambah kaku, semakin banyak monster yang mengerumuni dirimu. Kamu hanya bisa menangkis mereka sebisa kamu sambil mencoba untuk bertahan hidup hingga pintu keluar.");
        System.out.println("Setelah perjuangan yang keras, akhirnya kamu berhasil sampai pada ruangan selanjutnya.\nKamu segera menutup pintu dari ruangan terkutuk tersebut dan duduk untuk menghela nafas.");
        System.out.println("Sesaat istirahat kamu menyadari bahwa tubuhmu terluka parah, mungkin tidak terasa karena bisa dari monster tersebut.\nLama kelamaan rasa sakitnya mulai muncul pada tubuhmu.");
        System.out.println("[Nyawamu berkurang!]");
        health = health - 9;
        System.out.println("Nyawamu : " + health);
        jeda1();
        System.out.println("Kamu melihat sekitar dan kamu menemukan kotak harta karun. Kamu berharap didalamnya ada potion untuk menyembuhkan dirimu\nDan ternyata benar saja, didalamnya ada sebuah tengkorak tua, dengan botol potion yang belum dibuka.");
        System.out.println("Kamu segera mengkonsumsi potion tersebut, pelan pelan kamu merasa tubuhmu lebih sehat, walaupun tidak sepenuhnya.");
        System.out.println("[Nyawamu bertambah!]");
        health = health - 4;
        System.out.println("Nyawamu : " + health);
        jeda1();
        System.out.println("Kamu akhirnya dapat bergerak dengan leluasa.\nSelidik demi selidik, kamu menemukan tengkorak pada harta karun tadi 'memegang' pedang, yang kelihatannya jauh lebih bagus kondisinya dibanding pedangmu yang kurang terurus.");
        System.out.println("Kamu memilih untuk mengambil pedangnya untuk senjata utamamu.");
        System.out.println("[Kekuatanmu bertambah!]");
        strength = strength + 4;
        System.out.println("Kekuatanmu : " + strength);
        jeda1();
        System.out.println("Setelah semuanya sudah siap, kamu akhirnya melanjutkan perjalananmu kedalam.");
        Boss();
    }

    static void RuteDuaDua(){
        System.out.println("[PLACEHOLDER]Lawan monster, satu-satu, kena serang, semua mati, mau pingsan, tiba tiba ada setan, nawarin pilihan, mati disini juga, atau tanda-tangan kontrak dia, kalo mati ya mati, kalo iya nanti dikasih kekuatan berlebih.");
        System.out.println("Kamu berpikir kamu cukup kuat untuk melawan semua monster didalam sini satu persatu.\nKamu menyiapkan pedangmu dan mulai menerobos puluhan monster tersebut, menebas apa saja yang mendekati dirimu");
        System.out.println("Satu persatu monster kamu serang, kamu bunuh, kamu habiskan. Tetapi kamu merasa seperti monster-monster ini tidak ada habisnya...");
        System.out.println("Kamu tidak bisa menangkis semua gigitan monster-monster ini jadi terkadang dirimu terkena gigit, walaupun sakit tetapi kegigihan kamu tetap mendorong dirimu");
        jeda05();
        System.out.println("[Nyawamu berkurang!]");
        health = health - 2;
        System.out.println("Nyawamu : " + health);
        jeda05();
        System.out.println("Satu, persatu, jatuh, tumbang, tergeletak lemas. Kamu tidak menyadari bahwa tubuhmu mati rasa karena bisa dari monster monster ini.\nKamu mengambil hal ini sebagai sebuah keberuntungan, karena kamu tidak dapat merasakan sakit...");
        jeda05();
        System.out.println("[Nyawamu berkurang!]");
        health = health - 2;
        System.out.println("Nyawamu : " + health);
        jeda05();
        System.out.println("Kamu tidak bisa merasakan sensasi pada tubuhmu, dan mungkin sebentar lagi kamu bisa tumbang. Tetapi kamu masih tidak mau mengalah dan tetap membasmi monster di ruangan ini...");
        jeda05();
        System.out.println("[Nyawamu berkurang!]");
        health = health - 2;
        System.out.println("Nyawamu : " + health);
        jeda05();
        System.out.println("Kamu sudah tidak bisa fokus, kamu hanya bisa menebas apapun yang bergerak dalam penglihatan kamu yang sudah sangat buram. Kamu merasa sedikit lagi....");
        jeda05();
        System.out.println("sedikit lagi....");
        jeda05();
        System.out.println("sedikit lagi....");
        jeda05();
        System.out.println("Dan sedikit lagi... semua ini akan selesai....");
        jeda1();
        System.out.println("[Nyawamu berkurang!]");
        health = health - 2;
        System.out.println("Nyawamu : " + health + ", Nyawa kamu kritis!");
        jeda05();
        System.out.println("Dan akhirnya pemikiran tersebut, terkabul. Kamu tidak menyadari tetapi sudah tidak ada kehadiran makhluk hidup disekitarmu selain dirimu");
        System.out.println("Tidak kuat untuk berdiri, kamu tumbang, terkulai lemas pada tanah semerbak darah dan mayat dimana-mana");
        System.out.println("Kamu sudah seperti menerima kenyataan bahwa kamu dapat mati saat ini juga. Dan kamu hanya bisa tertawa lemah.");
        jeda1();
        System.out.println("Seketika kamu dapat mendengar sayup sebuah tawaan kecil dari ruangan tersebut. Kamu tidak tahu itu siapa tetapi kamu bahkan tidak memiliki energi untuk mengadah dan melihat.");
        System.out.println("'Luar biasa sekali pertunjukkanmu kawan! Pertama kalinya aku melihat seorang petualang segigih dirimu selama ratusan tahun aku berada dibawah sini' kata orang tersebut.");
        jeda05();
        System.out.println("'Tenang kawan. Aku bukanlah musuhmu, tetapi aku juga bukan temanmu. Aku hanyalah setan biasa yang mencari kesenangan dalam dungeon yang membosankan ini...'");
        System.out.println("'Aku melihat kegigihan kamu tadi kawan, jujur aku kagum! Dan aku ingin melihat bagaimana kamu dapat melawan monster yang ada diujung dungeon ini'");
        System.out.println("'Kamu bertanya kenapa? Ya, hiburan semata kawan! Aku dapat dengan mudah memberikan kamu bantuan untuk melawannya'");
        System.out.println("'Tetapi tidak tanpa bayaran kawan! Bagaimana jika kita bertaruh?'");
        System.out.println("'Jika kamu bertahan hidup melahan monster tersebut, kamu dapat menyimpan harta dan kekuatan yang kamu dapatkan'");
        System.out.println("Tetapi... jika kamu mati, tubuh mu menjadi kepemilikanku. Deal?");
        System.out.println("Pilihan kamu?? [ya/tidak]");
        rute2s = "null";
        bener = 0;
        while (bener==0){
         rute2s = input.next()+ input.nextLine();
         switch (rute2s) {
            case "ya":
             bener = 1;
             System.out.println("'Pilihan yang bagus kawan! Aku tahu kamu tak akan mengecewakanku!'");
             System.out.println("Dia mengambil tanganmu yang terkulai lemas dan menjabatnya");
             System.out.println("Seketika tubuh kamu merasa sangat kuat, dan kebas akan segala jenis sakit.");
             System.out.println("[Kamu merasa dirimu sangat kuat!]");
             strength = strength + 9;
             System.out.println("Kekuatanmu : " + strength);
             jeda1();
             System.out.println("'Ingat dengan janji kita, oke kawan?' Kata setan tersebut terakhir kalinya sebelum ia tertawa histeris dan menghilang seperti asap");
             janji = 1;
             System.out.println("[Kamu merasa kamu memiliki janji yang benar benar tidak bisa diingkari...]");
             System.out.println("Dengan kekuatan yang berlebih, kamu melanjutkan perjalanan kamu, dengan tujuan utama untuk melawan 'monster di ujung dungeon ini'...");
             Boss();
            break;

            case "tidak":
             System.out.println("'Hmm... Baik, aku tidak akan memaksa dirimu. Mungkin memang kematian yang tenang adalah pilihan kamu.'");
             System.out.println("'Tetapi ingat kawan...'");
             jeda05();
             System.out.println("'Tidak ada yang namanya kematian yang tenang jika kamu mati dalam dungeon ini!'");
             System.out.println("Setan tersebut tertawa histeris dan menghilang seperti asap, meninggalkan tubuhmu yang sudah tidak sadarkan diri.");
             Mati();
            break;

            default:
             System.out.println("[Masukkan input dengan benar!(ya/tidak)]");
            }
        }
    }
    static void RuteTiga(){
        route = "ketiga"; 
        System.out.println("Kamu memilih untuk melewati rute " + route + ".");
        System.out.println("Kamu diberikan pilihan untuk melewati lorong gelap atau terang");
        System.out.println("Karena ini pertarungan pertamamu, kamu memilih lorong yang terang.\nDiujung lorong kamu melihat sebuah pintu yang terlihat normal.\nKamu mencoba membuka pintu itu dan berfikiran pintu itu akan membawamu ke sisi Tuhan atau kamu mengetahui mekanisme untuk menutupnya.");
        System.out.println("Tetapi.. Ternyata pintu itu benar-benar biasa. Hanya saja kamu terlalu banyak berimajinasi dan berfikir yang aneh-aneh.");
        System.out.println("Di dalamnya kamu melihat 7 item yang tergeletak. Pada dinding ruangan tersebut tertuliskan 'Ambillah satu barang untuk kamu simpan selamanya'.");
        System.out.println("Kamu memilih untuk mengambil : ");
        System.out.println("1. Kotak harta karun berlapis Emas.\n2. Kotak harta karun biasa.\n3. Berlian terbesar yang kamu lihat.\n4. Tas ransel lusuh.\n5. Sebuah gulir yang memiliki segel kerajaan.");
        System.out.println("[Masukkan Inputmu]");
        bener = 0;
        rute = "0";
        rute = input.next()+ input.nextLine();
        while (bener == 0) {
            switch (rute){
                case "1" :
                 bener = 1;
                 System.out.println("Kamu membuka kotak emas tersebut dan mendapati di dalamnya banyak sekali harta. Harta tersebut kamu ambil semua hingga tidak bersisa.");
                 System.out.println("Ketika sudah terambil semua kamu melihat ada tombol kecil di dasar kotak tersebut.\nKamu penasaran dan akhirnya menekan tombol itu dan tiba-tiba terdengar suara gerbang yang terbuka lalu kamu menghampiri suara tersebut.");
                 System.out.println("Suara tersebut mengarah ke sebuah pintu berwarna emas. Kamu dengan bahagianya mengira pintu tersebut adalah pintu keluar lalu kamu membuka pintu tersebut.");
                 System.out.println("Seperti perkiraanmu pintu benar-benar menunjukkan jalan keluar. Kamu-pun bergegas untuk keluar melewati pintu itu dengan membawa harta yang kamu ambil dari kotak harta karun tadi.");
                 System.out.println("Setelah berjalan beberapa meter tiba-tiba terdengar suara motor RX-King mendekat. Benar saja, motor itu ternyata adalah begal dengan senjata yang sangat modern lagi canggih. Kamu berencana untuk melawannya dengan senjatamu.");
                 System.out.println("Naasnya, senjatamu kalah canggih. Dalam sekejap kamu tergeletak lemas dengan hartamu dibawa oleh begal tersrbut.");
                 Mati();
                break;
    
                case "2" :
                 bener = 1;
                 System.out.println("Kamu membuka kotak biasa tersebut. Ketika kamu membukanya, kotak tersebut ternyata berubah menjadi monster yang sangat berbahaya.\nKamu digigit oleh monster tersebut. Lalu terdampar dengan badan menjadi biru.");
                 Mati();
                break;
    
                case "3" :
                 bener = 1;
                 System.out.println("Kamu mengambil berlian tersebut dan kamu bawa.\nKetika kamu mengambilnya tiba-tiba ada goncangan dasyat di dalam ruangan tesebut.\nSatu demi satu puing-puing berjatuhan.");
                 System.out.println("Kamu panik dan akhirnya kamu lari sambil membawa berlian tersebut.\nKapanikanmu membuatmu gegabah dan melangkah tanpa arah.\nKamu tersandung dan jatuh, berlian yang ada pada mu juga terlempar jauh dari jangkauanmu.");
                 System.out.println("Tiba-tiba puing berukuean besar jatuh tepat di kakimu, sehingga kamu tidak bisa bergerak.\nDari atas muncul seekor monster raksasa yang mana itu adalah penjaga berlian tersebut.");
                 System.out.println("Monster itu melihat mu dan langsung menghancurkan tubuhmu berkeping-keping.");
                 Mati();
                break;
                
                case "4" :
                 RuteTigaTiga();
                break;
    
                case "5" :
                    RuteTigaEmpat();
                break;
                
                default :
                    System.out.println("Masukkan input yang benar! (1-5)");
            }
        }
    }
        
    static void RuteTigaTiga(){
        bener = 1;
        System.out.println("Kamu mengambil tas itu dan membukanya.\nTidak disangka tas selusuh itu dalamnya adalah baju zirah yang kuat.\nKamu mmakai baju zirah tersebut dan kamu merasa dirimu menjadi jauh lebih kebal!\n[Health+15]");
        health = health + 15;
        System.out.println("Nyawa kamu : " + health);
        System.out.println("Kamu menyadari bahwa baju zirah yang kamu pakai ini cukup berat. Kamu mencoba untuk melanjutkan perjalananmu tetapi rasanya sangat aneh karena beban yang kamu bawa, kamu mencoba untuk melanjutkan perjalananmu.");
        System.out.println("Setelah melewati pintu ruangan, kamu tidak sengaja menginjak tombol yang sepertinya memicu sebuah perangkap. Kamu mendengar seperti sebuah kontrapsi tepat diatas kepalamu dan kamu melihat bahwa ada pintu perangkap yang terbuka.");
        System.out.println("Kaget, kamu segera menghindar dari tepat dibawah pintu perangkap tersebut. Jatuh sebuah bola batu besar! Kamu segera berlari menjauhi bola tersebut.\nYang tidak kamu ketahui adalah pedang kamu terjatoh seiring kamu berlari karena cara anehnya kamu berlari.");
        System.out.println("Kamu berpikir bagaimana kamu akan melawan monster-monster nanti tapi sepertinya itu harus digeser terlebih dahulu...\n[Strength - 0.5 !]");
        strength = strength - 0.5;
        System.out.println("Kekuatan kamu : " + strength);
        Trap();
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



    static void Trap(){
        System.out.println("[Trap Sequence Start! Ingat bahwa memasuki input yang tidak benar akan membawamu ke hasil yang tidak diinginkan...]");
        System.out.println("Kamu berlari mencoba menghindari batu tersebut. Didepanmu jalannya bercabang jadi dua arah! Kamu memilih untuk menghindar ke : ");
        System.out.println("[Masukkan Inputmu!]");
        rute2s = "null";
        rute2s = input.next()+ input.nextLine();
        switch (rute2s) {
            case "kiri":
             System.out.println("Kamu berbelok kekiri, yang ujung ujungnya ternyata jalan buntu! Batu tersebut tepat di ekormu. Badanmu terdorong pipih...");
             Mati();
            break;

            case "kanan":
             Trap2();
            break;

            default:
             System.out.println("Kamu tidak tahu apa yang kamu lakukan, badanmu menabrak sebuah dinding, tidak sadarkan diri");
             Mati();
        }
    }

    static void Trap2(){
         System.out.println("Kamu mengambil rute kanan, menemukan lorong yang tambah panjang. Kamu melihat kebelakangmu dan melihat batu tersebut berguling ke arah yang lain.");
         System.out.println("Walaupun kamu merasa lega sesaat, kamu menyadari bahwa dinding lorong disampingmu terbuka, kamu bertanya kok bisa? Sampai kamu melihat kakimu, ternyata kamu menginjak pemicu perangkap lagi. Pintar ya.");
         System.out.println("Dari kegelapan tersebut keluar banyak sekali monster bermuka babi, lengkap dengan senjata siap untuk menyerang intruder disana.");
         System.out.println("Menghela nafas, kamu melanjutkan diri kamu untuk melarikan diri!");
         System.out.println("Selagi melarikan diri, kamu menginjak pemicu salah satu perangkap, kamu mendengar sesuatu dari kari kamu.\nPerasaan kamu buruk dan mendorong kamu untuk mencoba menghindar.\nAntara bawah atau depan kamu memilih : ");
         System.out.println("[Masukkan inputmu]");
         rute2s = "null";
         rute2s = input.next()+ input.nextLine();
         switch (rute2s) {
             case "bawah":
                 System.out.println("Kamu mencoba berguling, berharap menghindar dari apa yang akan yang keluar dari kontrapsi tersebut.\nDan ternyata benar saja, sebuah tombak panjang lansung meluncur keluar dari lubang, siap menusuk apa saja yang didepannya.");
                 System.out.println("Setelah berguling kamu kembali ke posisi ancang-ancang, dan melanjutkan untuk melarikan diri dari monster dibelakangmu.\nKamu dapat melihat monster-monster tersebut bereaksi kaget pada perangkap tadi tetapi kamu tidak peduli.");
                 Trap3();;
                break;
 
             case "depan":
                 System.out.println("Kamu berusaha untuk melompat kedepan berusaha untuk menghindar, dan benar saja keluar sebuah tombak tajam siap menusuk apa saja yang ada didepannya.\nSayangnya kamu melompat dalam keadaan panik sehingga kamu tidak dapat mendarat dengan benar, kamu mendarat dengan mukamu!");
                 System.out.println("Kamu sedikit kaget, dan mencoba untuk kembali melarikan diri lagi. Tetapi karena kamu cukup lamban, salah satu monster tersebut dapat melukaimu, sayangnya pada bagian kaki juga!");
                  System.out.println("[Nyawamu berkurang!]");
                 health = health - 3;
                 System.out.println("Nyawamu : " + health);
                 Trap2_1();
                break;
 
             default:
                 System.out.println("Otak kamu seketika kosong. Tidak sadarkan diri, keluar sebuah tombak tajam, tanpa ampun menusuk dirimu secara sadisnya.\nMayat tubuhmu lansung menjadi makanan untuk monster-monster tersebut...");
                 Mati();
            }  
    }

    static void Trap2_1(){
     System.out.println("Kakimu terluka, tetapi kamu tetap mencoba untuk melarikan diri. Monster yang sudah menyerang kamu ini terlalu dekat untuk dirimu merasa nyaman.\nKamu hanya memiliki dua pilihan, serang atau lari, kamu memilih : ");
     System.out.println("[Masukkan inputmu]");
     rute2s = "null";
     rute2s = input.next()+ input.nextLine();
     switch (rute2s) {
         case "serang":
             System.out.println("Monster yang menyerangmu ini satu-satunya monster yang sudah cukup dekat denganmu. Kamu berpikir bahwa melarikan diri mungkin cukup beresiko. Kamu membuat monster tersebut tersandung dengan kaki kamu yang masih sehat");
             System.out.println("Monster tersebut kemudian jatuh, melepaskan senjatanya, yaitu kapak tumpul yang terbuat dari batu tajam yang diikat pada kayu. Kamu menggunakan senjatanya untuk menyerang kepalanya\nMonster tersebut mengeluarkan suara yang tidak enak kemudian terkulai lemas.");
             System.out.println("Kamu menyimpan kapak tersebut, antara menjadi senjata sampingan atau utama. Kamu kemudian melanjutkan melarikan diri walaupun kakimu terluka.");
             System.out.println("[Kekuatanmu bertambah!]");
             strength = strength + 0.3;
             System.out.println("Kekuatanmu : " + strength);
             Trap3();;
            break;

         case "lari":
             System.out.println("Kamu berusaha untuk berlari menjauhi monster tersebut tetapi monster tersebut mengetahuinya dan dirimu lansung terserang oleh kapaknya. Kamu yang tidak siap lansung terjatuh ke tanah");
             System.out.println("Badanmu masih merintih kesakitan, kesulitan untuk bergerak. Tetapi Monster tersebut seperti sudah menunggu kematianmu.");
             System.out.println("Mungkin kalau kamu masih hidup, kamu berpikir apa yang mereka lakukan dengan tubuhmu...");
             Mati();
            break;

         default:
             System.out.println("Kamu melamun, dan monster tersebut tidak menunggu aksi kamu selanjutnya. Badanmu segara diserang dari berbagai bagian oleh monster-monster tersebut.");
             Mati();
     }
    }
    static void Trap3(){
     System.out.println("Kamu lanjut berlari, ingin sekali untuk keluar dari lorong ini. Ternyata lorong tersebut berkata lain.\nKamu melihat dinding sekitarmu mulai mendorong keluar,\nLorong tersebut lama kelamaan mengecil, jika kamu cukup lambat kamu sudah tau hasilnya.");
     System.out.println("Dua pilihan, lompat atau lari. Kamu memilih : ");
     System.out.println("[Masukkan inputmu]");
     rute2s = "null";
     rute2s = input.next()+ input.nextLine();
     switch (rute2s) {
         case "lompat":
             System.out.println("Kedua dinding disamping mu sudah mulai menutup, kamu akhirnya melihat pintu akhir dari lorong ini.");
             System.out.println("Kamu berpikir bahwa kamu tidak akan sampai ke ujung dari lorong ini, jadi kamu melompat, berharap sampai dan selamat.\nDan beruntungnya kamu memang selamat!");
             System.out.println("Kaki kamu merasa melemah, dan kamu jatuh hanya untuk mengambil nafas.");
             System.out.println("Penasaran namun letih, kamu tidak peduli dengan kondisi monster-monster yang mengejarmu tadi. Yang penting dirimu selamat.");
             System.out.println("Setelah mempersiapkan dirimu dari aksi sebelumnya, kamu memberanikan diri untuk melanjutkan perjalananmu lebih dalam..");
             Boss();
            break;

         case "lari":
             System.out.println("Kamu berpikir bahwa kamu dapat berlari lebih kencang dari dinding tersebut menutup, jadi kamu mencoba untuk meningkatkan kecepatanmu.\nSayangnya kamu kurang cepat dan dinding tersebut sudah memperangkap dirimu.");
             System.out.println("Badanmu masih merintih kesakitan, kesulitan untuk bergerak. Tetapi Monster tersebut seperti sudah menunggu kematianmu.");
             System.out.println("Kamu hanya bisa menahan kesakitan dari ditindih dinding raksasa dari dua sisi...");
             Mati();
            break;

         default:
             System.out.println("Berpikir yang aneh aneh, kamu malah tersandung kemudian terjatuh.\nKamu hanya bisa melihat ujung dari lorong tersebut dalam pemikiranmu sebelum akhirnya kamu mati digencet dua dinding.");
             Mati();
       }
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
                 System.out.println("Badanmu terkulai lemah, dan tidak memiliki energi lagi. Kamu melihat kearah monster tersebut, dan kamu melihat monsternya runtuh ambruk.\n"); jeda05();
                 System.out.println("Kamu berhasil melawan boss tersebut tetapi tubuhmu sudah sangat rapuh..."); jeda05();
                 System.out.println("Kamu menjatuhkan tubuhmu ke tanah, terkulai lemas. Kamu tersenyum dengan genggaman tanganmu melepaskan pedangmu secara perlahan..."); jeda05();
                 Mati();
                 loop = 1;
            }
        }
         else {
             if (health > 0) {
                 Bossfight();
            } 
            else {
                 System.out.println("Tubuhmu sudah sangat lemah untuk tetap menerima serangan selanjutnya dari monster tersebut."); jeda05();
                 System.out.println("Kamu mencoba untuk menangkis kembali serangan dari monster itu, tetapi dengan tidak ada tenaga, badanmu dengan mudah terlempar jauh."); jeda05();
                 System.out.println("Terkulai lemas, kamu dengan mudah dihabiskan oleh monster tersebut dan kamu tidak bisa melakukan apa apa..."); jeda05();
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
             Damage = Dmg() * strength * 100;
             Bosshealth = Bosshealth - Damage;
             jeda05();
             System.out.println("Kamu menyerang sebesar " + Damage + "! Nyawa boss tersebut sisa : " + Math.round(Bosshealth));
             loop2 = 1;
            break;
             default:
            System.out.println("[Masukkan input serang!]");
            }
        }
    }
    static void Mati() {
     jeda1();
     System.out.println("Kamu mati!\nSayang sekali hidupmu sebagai penjelajah berakhir sampai sini...");     jeda05();
     if(janji == 1){
         System.out.println("Sesuai dengan janjimu. Sebuah setan datang dan menemukan tubuhmu yang sudah tidak bergerak lagi");
         System.out.println("'Ingat janjimu kawan~~ sayang sekali perjalananmu berakhir disini~'");  
         System.out.println("'Senang bertaruh denganmu kawan! Lumayan puluhan tahun kesenangan dalam dunia manusia!'");
         System.out.println("'Selamat bersenang senang menjadi penghuni dari tempat terkutuk ini!!'");
         System.out.println("Setan tersebut merasuki tubuhmu kemudian menghilang dengan tawaannya yang histeris...");
        }
     System.out.println("Mungkin selanjutnya harus lebih hati-hati lagi. . .");     jeda05();
     System.out.println("Coba untuk jelajahi jalan yang belum kamu pilih, mungkin kamu akan menemukan sesuatu...");     jeda05();
    }
    static void Win() {
     System.out.println("Setelah pertarungan yang sangat sengit, kamu akhirnya melihat hasil dari kerja kerasmu.");
     System.out.println("Monster tersebut, bergetar. Seperti tidak kuat untuk menahan tubuhnya tetap utuh...");
     System.out.println("Pelan pelan kamu melihat tubuhnya runtuh satu-persatu.");
     System.out.println("Didepan matamu hanyalah seonggok tulang yang tidak bernyawa, bukti dari peperanganmu.");
     System.out.println("Kamu tidak percaya apa yang telah kamu capai. Kamu tidak tahu harus merasa senang atau kagum. Dua duanya?");
     System.out.println("Sebuah perjalanan yang tangguh, tetapi kamu berhasil melewatinya!!");
     System.out.println("Sebagai tanda kemenangan, kamu mengambil pedang raksasa dari monster tersebut. Merangkulnya seperti sebuah piala.");
     System.out.println("Pada perjalanan keluar, kamu menemukan ruangan penuh emas, harta dan mayat tengkorak!!!!");
     System.out.println("Tidak mempedulikan mayatnya, kamu merasa senang atas imbalan dari perjuanganmu.");
     System.out.println("Kamu mengandai-andai bagaimana kehidupan kekayaaanmu sehabis ini...");
     System.out.println("[THE END!]");
    }
    
} 
