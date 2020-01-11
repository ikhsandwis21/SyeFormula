package com.ikhsan.syeformula.model;

import com.ikhsan.syeformula.R;

import java.util.ArrayList;

public class ResepModel {

    private static String[] namaKue ={
            "Kue Pukis",
            "Bolu Pisang",
            "Onde-onde",
            "Kue Lumpur",
            "Nagasari",
            "Donat Kentang",
            "Bakpia",
            "Molen Pisang",
            "Kroket",
            "Roll Coco"
    };

    private static String[] deskripsiKue={
            "Kue pukis merupakan kue yang banyak disukai orang dan hampir semua daerah mengenak jenis kue basah satu ini.",
            "Jika kamu mau yang beda, kamu bisa mencoba untuk membuat bolu pisang. Teksturnya yang lembut, membuat cake satu ini banyak digemari.",
            "Onde-onde merupakan makanan yang sudah tidak asing lagi. Rasanya yang enak, tentunya banyak disukai orang. Kamu bisa membuatnya sendiri di rumah.",
            "Kue lumpur merupakan jenis kue yang sangat mudah dibuat, tanpa harus menggunakan oven.",
            "Makanan tradisional satu ini meski sangat mudah ditemukan, namun tetap saja masih banyak yang ingin membuatnya sendiri.",
            "Donat kentang bukan suatu yang asing lagi, cara membuatnya cukup mudah.",
            "Bagi kamu yang suka makan bakpia, coba deh untuk buat sendiri dengan kreasi yang lebih menarik.",
            "Molen pisang tentunya bukan yang baru lagi dikalangan masyarakat luas. Meski demikian orang tak pernah bosan memakannya.",
            "Kalau buka puasa biasanya selain cari yang segar-segar, orang juga suka makan berupa gorengan. Kroket singkong keju bisa jadi pilihan terbaik nih.",
            "Dari bentuknya saja sudah enak banget kan? Cara buatnya cukup mudah lho."
    };

    private static String[] bahanKue={
            "- 200 gram tepung terigu\n- 3 butir telur ayam utuh\n- 2 kuning telur\n- 300 mili santan\n- 70 mili air hangat\n- 1 sendok makan ragi kue\n- 1 sendok makan garam\n- 150 gram gula pasir\n- 130 gram keju\n - 130 gram meisis cokelat",
            "- 300 Gram tepung terigu\n- 200 Gram gula pasir\n- 100 ml minyak goreng\n- 50 ml air putih\n- 4 Butir telur ayam\n- 2 Sendok teh perasa pisang\n- 1 Sendok SP\n- 1 Sendok teh vanili bubuk\n- Meses & cokelat masak putih secukupnya\n- Pewarna makanan kuning secukupnya",
            "Bahan isi:\n- 150 gr kacang hijau kupas, direndam selama 1 jam\n- 100 gr gula pasir\n- 2 lembar daun pandan, diikat simpul\n- 1/2 sdt garam\n- 200 ml santan dari 1/2 butir kelapa\n\nBahan kulit:\n- 250 gr tepung ketan putih\n- 1/2 sdt grm\n- 50 gr kentang kukus, dihaluskan\n- 75 gr gula pasir halus\n- 160 ml air hangat\n- 125 gr wijen untuk pelapis\n- Minyak untuk menggoreng",
            "- 500 gr pure labu kuning\n- 3 kuning telur\n- 2 putih telur\n- 250 gr gula pasir\n- 1/2 sdt garam\n- 1 sdt vanilli\n- 250 gr tepung terigu serbaguna\n- 450 ml santan dari 1/2 butir kelapa\n- 2 helai daun pandan, simpulkan\n- 100 gr margarin, lelehkan\n- keju untuk topping secukupnya",
            "- 500 gr tepung beras\n- 1,5 liter santan biasa (tidak kental tidak cair)\n- 250 gr gula pasir\n- 4 lembar daun pandan\n- 1/2 sdm garam\n- pisang raja iris iris untuk isian",
            "- 400 gr tepung terigu protein tinggi\n- 100 gr tepung terigu protein sedang\n- 50 gr susu bubuk\n- 11 gr ragi instan\n- 200 gr kentang kukus, haluskan dan dinginkan\n- 100 gr gula kastor\n- 75 gr mentega\n- 1/4 sdt garam\n- 4 kuning telur\n- 100 ml air dingin / susu cair dingin",
            "- 380 gr terigu\n- 80 gr gula pasir\n- 75 gr mentega\n- 1/2 bks ragi instant\n- Sedikit garam\n- 180 ml air hangat",
            "Bahan kulit:\n- 500 gr terigu protein sedang\n- 1/2 sdt garam\n- 1 sdm gulpas\n- 100 gr margarin\n- 60 ml minyak goreng\n- 170 ml air\n\nBahan Isi:\n 5 buah Pisang nangka /sesuai selera (sy pisang gepok ngk kukus lg krn udh mateng / lembut) dikukus sampai matang. Potong memanjang 1 buah pisang menjadi 4 bagian. Sisihkan (hasil 20 potong).",
            "Bahan kulit:\n- 600 gr singkong kukus, haluskan\n- 1/2 - 1 butir telur kocok lepas (menyesuaikan kelembekan adonan)\n- 160 gr keju cheddar parut\n- 1/2 siung bawang bombay (cincang, tumis sedikit minyak lalu haluskan)\n- 2 siung bawang putih (cincang, tumis sedikit minyak lalu haluskan)\n- 1/2 butir pala, haluskan\n- 1/2sdt lada halus\n- Secukupnya garam\n\nBahan isian:\n- 100 gr daging sapi giling\n- 50 gr wortel potong dadu\n- 50 gr kacang polong\n- 1 batang daun bawang, dirajang\n- 2 sdm tepung terigu, larutkan sedikit air\n\nBahan pelapis:\n- 2 butir telur kocok lepas\n- Tepung terigu secukupnya\n- Tepung panir halus (diblender dulu) secukupnya",
            "- 4 telur utuh\n- 4 kuning telur\n- 90gr gula\n- 60gr tepung\n- 1 sdm coklat bubuk\n- 10gr maizena\n- 20gr ss bubuk\n- 100gr butter\n- Pasta coklat blackforest"
    };

    private static String[] caraMembuatKue={
            "- Potong atau parut keju sebagai topingnya. Kemudian campurkan ragi kue dengan air hangat dan mengaduknya sampai larut. Setelah larut secara sempurna maka sisihkan.\n- Rebus santan, dengan diaduk terus agar santan tidak menggumpal atau pecah. Hal itu dilakukan sampai santan mendidih, setelah mendidih maka api dapat dimatikan dan biarkan santan menghangat.\n- Kemudian masukkan ragi kue ke dalam adonan tersebut dan masukkan santan hangat. Aduk lagi hingga semua bahan tersebut tercampur merata atau tidak ada gumpalan sekalipun kecil. Setelah itu diamkan sekitar 15 sampai 25 menit.\n- Siapkan cetakan kue pukis atau loyang di atas kompor dengan api kecil. Api besar wajib dihindari agar kue tidak gosong atau matang hanya sebagian.\n- Setelah itu oles cetakan kue dengan margarine. Maka adonan dapat di tuang ke cetakan sampai hampir penuh dan tutup sebentar. Setelah beberapa menit buka penutup tersebut dan berikan taburan keju atau meises maupun topping lain sesuai selara. Kemudian tutup kembali sampai matang.\n- Tatkala kue pukis dirasa sudah matang, maka angkat kue cubit dari cetakan. Lalu sajikan kue pukis sebagai teman keluarga atau persiapan untuk jualan maupun menyambut hari penting.",
            "- Kocok telur, SP, gula pasir,vanili dengan mixer selama 10 menit.\n- Turunkan kecepatan mixer, masukkan tepung, minyak goreng & air. Kocok sampai rata.\n- Tambahkan perasa pisang dan pewarna kuning, kemudian aduk rata.\n- Panaskan kukusan, kemudian kukus selama 10 menit. Keluarkan dari cetakan dan tunggu sampai dingin.\n- Oles bagian ujung dan samping dengan cokelat masak putih yang sudah dilelehkan dan dicampur pewarna kuning.\n- Tunggu sampai cokelat mengeras, kemudian sajikan kue pisang.",
            "- isi : kukus kacang hijau kupas selama 25 menit. Angkat, lalu blender halus bersama santan\n- di dalam panci, masak kacang hijau yg sudah di haluskan bersama sisa santan, gula pasir, garam dan daun pandan. Aduk sampai kalis, biarkan dingin bentuk bulat, supaya rapi bisa di timbang. Masing2 15 gr sisihkan (sy ga timbang, hanya kira2 aja)\n- kulit : campur tepung ketan putih, kentang kukus, gula pasir halus dan garam aduk rata\n- tuang air hangat sedikit2 sampai kalis dan licin\n- timbang masing-masing 25 gr (sy ga nimbang) pipihkan, beri isi bentuk bulat, lakukan sampai adonan habis",
            "- Masak santan bersama daun pandan hingga mendidih. Dinginkan.\n- Kocok telur dan gula pasir hingga mengembang dan berwarna pucat. Tambahkan garam dan vanilli, kocok hingga rata.\n- Masukkan santan sedikit demi sedikit sambil terus dikocok rata dengan mixer kecepatan rendah atau bisa diaduk memakai spatula.\n- Masukkan margarin leleh. Aduk hingga rata.\n- 6. Panaskan cetakan kue lumpur, tuang adonan ke dalamnya dan tutup, gunakan api kecil ya. Setelah 3/4 matang, beri topping dan lanjutkan memasak hingga matang.",
            "- Siapkan dandangan, kukus sebentar tepung beras kurleb 15menit\n- Sementara kita mengukus tepung beras, rebus santan, gula, garam daun pandan hingga mendidih, matikan api\n- Siapkan tempat, lalu tuang sedikit demi sedikit santan rebus hingga adonan kalis dan bisa dibentuk\n- Masukkan adonan nagasari ke dalam daun nangka lalu beri topping pisang\n- Kukus lagi selama 15menit hingga matang",
            "- Campurkan tepung terigu, susu bubuk, gula dan ragi. Aduk hingga rata. Tambahkan kentang halus, masukkan kuning telur dan tambahkan air sedikit demi sedikit sambil diuleni hingga rata dan setengah kalis.\n- Masukan garam dan mentega, terus uleni hingga kalis dan elastis. Diamkan selama kurang lebih 20-30 menit, tutupi dengan serbet lembab agar adonan tidak kering.\n- Kempiskan adonan, bagi adonan masing -masing 50 gr, bulatkan. Diamkan 20-30 menit, hingga mengembang.\n- Lubangi tengahnya, menjadi bentuk donat, segera goreng sampai kuning kecoklatan.\n- Goreng donat dengan api sedang cenderung kecil hingga kecoklatan. - Angkat dan tiriskan. Setelah dingin bisa diberi topping sesuai selera.\n",
            "- Campurkan terigu, gula pasir & ragi\n- Tuang air hangat, uleni sampai setengah kalis\n- Masukkan garam & mentega, uleni sampai kalis elastis\n- Bulatkan adonan, diamkan 1 jam\n- Kempiskan adonan, bagi2 adonan (aku 20 gr, jadinya agak mini).\n- Beri isian (aku pake isi kacang ijo) kemudian tutup & bulatkan. Diamkan kembali 30 menit\n- Panaskan teflon, jangan oles apapun. Panggang sambil agak ditekan. Balik sisi lainnya setelah agak kecoklatan.",
            "- Panaskan margarin dan minyak sampai larut dan margarin mencair.\n- Dalam keadaan panas, tuang ke terigu yang sudah dicampur garam dan gulpas, aduk rata lalu tambahkan air, aduk rata kembali. Diamkan selama 15 menit.\n- Bagi adonan menjadi 20 bagian, giling tipis memanjang tiap bagiannya, lilitkan pada pisang yang sudah dikukus tadi. Lakukan sampai semua bahan habis.\n- Goreng dlm minyak panas, api kecil sampai kekuningan.",
            "- Tumis bumbu isian dengan margarin hingga harum. Masukkan daging giling, tumis hingga matang. Masukkan sayuran, tambahkan saus tiram, lada, pala, dan garam. Tumis hingga sayuran layu. Tambahkan larutan terigu. Aduk-aduk hingga mengental. Matikan api\n- Campur semua bahan kulit kroket hingga rata. Sisihkan.\n- Membentuk kroket: olesi tangan dengan minyak, taruh adonan kulit di tangan dan pipihkan. Taruh isian kroket di tengahnya. Tutup adonan, pulung dengan tangan hingga berbentuk bulat lonjong.\n- Melapisi kroket: Balurkan kroket ke tepung terigu, selanjutnya celupkan ke kocokan telur, dan terakhir balurkan ke tepung panir.\n- Simpan kroket di freezer sekitar 1-2 jam agar bahan pelapis lebih merekat ke kroket.\n- Goreng kroket secara deep fried (minyak panas dan banyak) hingga berwarna coklat kekuningan. Siap disajikan.",
            "- Mixer telur dan gula smp mengembang dan kental,aduk tepung dan butter leleh pk spatula\n- Panggang lbh krg 15mnt suhu 170c,tergantung oven masing-masing\nLoyang uk 24x28\n- Tunggu dingin,oles buttercream gulung dan padatkan."
    };

    private static int[] foto1Kue={
            R.drawable.kue_pukis,
            R.drawable.bolu_pisang,
            R.drawable.onde_onde,
            R.drawable.kue_lumpur,
            R.drawable.nagasari,
            R.drawable.donat_kentang,
            R.drawable.bakpia,
            R.drawable.molen_pisang,
            R.drawable.kroket,
            R.drawable.roll_coco
    };

    private static int[] foto2Kue={
            R.drawable.kue_pukis2,
            R.drawable.bolu_pisang2,
            R.drawable.onde_onde2,
            R.drawable.kue_lumpur2,
            R.drawable.nagasari2,
            R.drawable.donat_kentang2,
            R.drawable.bakpia2,
            R.drawable.molen_pisang2,
            R.drawable.kroket2,
            R.drawable.roll_coco2
    };

    private static int[] foto3Kue={
            R.drawable.kue_pukis3,
            R.drawable.bolu_pisang3,
            R.drawable.onde_onde3,
            R.drawable.kue_lumpur3,
            R.drawable.nagasari3,
            R.drawable.donat_kentang3,
            R.drawable.bakpia3,
            R.drawable.molen_pisang3,
            R.drawable.kroket3,
            R.drawable.roll_coco3
    };

    public static ArrayList<Resep> getListData(){
        ArrayList<Resep> list = new ArrayList<>();
        for (int position=0;position<namaKue.length;position++){
            Resep resep = new Resep();
            resep.setNama(namaKue[position]);
            resep.setDeskripsi(deskripsiKue[position]);
            resep.setBahan(bahanKue[position]);
            resep.setCara(caraMembuatKue[position]);
            resep.setFoto1(foto1Kue[position]);
            resep.setFoto2(foto2Kue[position]);
            resep.setFoto3(foto3Kue[position]);
            list.add(resep);
        }
        return list;
    }

}
