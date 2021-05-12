/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.esmax.reportesOperacionales;

/**
 *
 * @author Gianni
 */
public class VolumenTke 
{
    public double VolTk(double Altura , double Tk )
    {
        double VolTk;
        double alt_tmp;
        double alt1;
        alt_tmp = Altura;
        VolTk = 1;
        
//        Si el valor devuelto es -1 significa que no existe el dato en las tablas de volumenes para el estanque seleccionado
//        Por tanto buscara el valor realizando el calculo en el algoritmo
        if (VolTk <= -1) {
           VolTk = 0;
           if ( Tk == 1 ) {
              alt1 = (126550 - Altura);
    
    if ( alt1 <= 18 ) { 
            VolTk = 33653 + (alt1 - 0) * 180.8333333333
    ;} else 
        if ( alt1 <= 98 ) { 
            VolTk = 36908 + (alt1 - 18) * 180.8
    ;} else 
        if ( alt1 <= 165 ) { 
            VolTk = 51372 + (alt1 - 98) * 180.686567164
    ;} else 
        if ( alt1 <= 225 ) { 
            VolTk = 63478 + (alt1 - 165) * 180.766666666
    ;} else 
        if ( alt1 <= 250 ) { 
            VolTk = 74324 + (alt1 - 225) * 180.84
    ;} else 
        if ( alt1 <= 270 ) { 
            VolTk = 78845 + (alt1 - 250) * 181
    ;} else 
        if ( alt1 <= 300 ) { 
            VolTk = 82465 + (alt1 - 270) * 173.833333333
    ;} else 
        if ( alt1 <= 350 ) { 
            VolTk = 87680 + (alt1 - 300) * 173.86
    ;} else 
        if ( alt1 <= 370 ) { 
            VolTk = 96373 + (alt1 - 350) * 173.9
    ;} else 
        if ( alt1 <= 420 ) { 
            VolTk = 99851 + (alt1 - 370) * 181.12
    ;} else 
        if ( alt1 <= 500 ) { 
            VolTk = 108907 + (alt1 - 420) * 181.1375
    ;} else 
       if ( alt1 <= 600 ) { 
     VolTk = 123398 + (alt1 - 500) * 181.1
    ;} else 
        if ( alt1 <= 800 ) { 
     VolTk = 141508 + (alt1 - 600) * 181.105
    ;} else 
        if ( alt1 <= 1000 ) { 
     VolTk = 177729 + (alt1 - 800) * 181.08
    ;} else 
        if ( alt1 <= 1200 ) { 
     VolTk = 213945 + (alt1 - 1000) * 180.985
    ;} else 
        if ( alt1 <= 1450 ) { 
     VolTk = 250142 + (alt1 - 1200) * 180.856
    ;} else 
        if ( alt1 <= 1650 ) { 
     VolTk = 295356 + (alt1 - 1450) * 180.87
    ;} else 
        if ( alt1 <= 1850 ) { 
     VolTk = 331530 + (alt1 - 1650) * 181.105
    ;} else 
        if ( alt1 <= 2150 ) { 
     VolTk = 367751 + (alt1 - 1850) * 181.106666666
    ;} else 
        if ( alt1 <= 2550 ) { 
     VolTk = 422083 + (alt1 - 2150) * 181.1075
    ;} else 
        if ( alt1 <= 3000 ) { 
     VolTk = 494526 + (alt1 - 2550) * 181.106666666
    ;} else 
        if ( alt1 <= 3400 ) { 
     VolTk = 576024 + (alt1 - 3000) * 181.1075
    ;} else 
        if ( alt1 <= 3450 ) { 
     VolTk = 648467 + (alt1 - 3400) * 181.12
    ;} else 
        if ( alt1 <= 3550 ) { 
     VolTk = 657523 + (alt1 - 3450) * 181.28
    ;} else 
        if ( alt1 <= 3750 ) { 
     VolTk = 675651 + (alt1 - 3550) * 181.285
    ;} else 
        if ( alt1 <= 4050 ) { 
     VolTk = 711908 + (alt1 - 3750) * 181.286666666
    ;} else 
        if ( alt1 <= 4450 ) { 
     VolTk = 766294 + (alt1 - 4050) * 181.285
    ;} else 
        if ( alt1 <= 4850 ) { 
     VolTk = 838808 + (alt1 - 4450) * 181.285
    ;} else 
        if ( alt1 <= 4950 ) { 
     VolTk = 911322 + (alt1 - 4850) * 181.3
    ;} else 
        if ( alt1 <= 5100 ) { 
     VolTk = 929452 + (alt1 - 4950) * 181.413333333
    ;} else 
        if ( alt1 <= 5500 ) { 
     VolTk = 956664 + (alt1 - 5100) * 181.4175
    ;} else 
        if ( alt1 <= 5900 ) { 
     VolTk = 1029231 + (alt1 - 5500) * 181.415
    ;} else 
        if ( alt1 <= 6300 ) { 
     VolTk = 1101797 + (alt1 - 5900) * 181.4175
    ;} else 
        if ( alt1 <= 6400 ) { 
     VolTk = 1174364 + (alt1 - 6300) * 181.42
    ;} else 
        if ( alt1 <= 6800 ) { 
     VolTk = 1192506 + (alt1 - 6400) * 181.335
    ;} else 
        if ( alt1 <= 7200 ) { 
     VolTk = 1265040 + (alt1 - 6800) * 181.33
    ;} else 
        if ( alt1 <= 7600 ) { 
     VolTk = 1337572 + (alt1 - 7200) * 181.3325
    ;} else 
        if ( alt1 <= 8000 ) { 
     VolTk = 1410105 + (alt1 - 7600) * 181.3325
    ;} else 
        if ( alt1 <= 8400 ) { 
     VolTk = 1482638 + (alt1 - 8000) * 181.3325
    ;} else 
        if ( alt1 <= 8800 ) { 
     VolTk = 1555171 + (alt1 - 8400) * 181.335
    ;} else 
        if ( alt1 <= 9200 ) { 
     VolTk = 1627705 + (alt1 - 8800) * 181.335
    ;} else 
        if ( alt1 <= 9300 ) { 
     VolTk = 1700239 + (alt1 - 9200) * 181.33
    ;} else 
        if ( alt1 <= 9400 ) { 
     VolTk = 1718372 + (alt1 - 9300) * 181.34
    ;} else 
        if ( alt1 <= 9700 ) { 
     VolTk = 1736506 + (alt1 - 9400) * 181.406666666
     ;} else 
        if ( alt1 <= 10000 ) { 
     VolTk = 1790928 + (alt1 - 9700) * 181.41
     ;} else 
        if ( alt1 <= 10300 ) { 
     VolTk = 1845351 + (alt1 - 10000) * 181.406666666
     ;} else 
        if ( alt1 <= 10600 ) { 
     VolTk = 1899773 + (alt1 - 10300) * 181.406666666
     ;} else 
        if ( alt1 <= 10900 ) { 
     VolTk = 1954195 + (alt1 - 10600) * 181.41
     ;} else 
        if ( alt1 <= 11200 ) { 
     VolTk = 2008618 + (alt1 - 10900) * 181.423333333
     ;} else 
        if ( alt1 <= 11500 ) { 
     VolTk = 2063045 + (alt1 - 11200) * 181.42
     ;} else 
        if ( alt1 <= 11899 ) { 
     VolTk = 2117471 + (alt1 - 11500) * 181.421052631;
        }
        }
     if ( Tk == 2 ) { 
    
        alt1 = (142900 - Altura);
    
      if ( alt1 <= 50 ) { 
     VolTk = 89712 + (alt1 - 0) * 411.5
    ;} else 
        if ( alt1 <= 60 ) { 
     VolTk = 110287 + (alt1 - 50) * 411.5
    ;} else 
        if ( alt1 <= 130 ) { 
     VolTk = 114402 + (alt1 - 60) * 411.4
    ;} else 
        if ( alt1 <= 150 ) { 
     VolTk = 143200 + (alt1 - 130) * 411.35
    ;} else 
        if ( alt1 <= 230 ) { 
     VolTk = 151427 + (alt1 - 150) * 411.1625
    ;} else 
        if ( alt1 <= 276 ) { 
     VolTk = 184320 + (alt1 - 230) * 411.282608695
    ;} else 
        if ( alt1 <= 290 ) { 
     VolTk = 203239 + (alt1 - 276) * 411.428571428
    ;} else 
        if ( alt1 <= 340 ) { 
     VolTk = 208999 + (alt1 - 290) * 411.46
    ;} else 
        if ( alt1 <= 425 ) { 
     VolTk = 229572 + (alt1 - 340) * 411.529411764
    ;} else 
        if ( alt1 <= 500 ) { 
     VolTk = 264552 + (alt1 - 425) * 411.6
    ;} else 
        if ( alt1 <= 576 ) { 
     VolTk = 295422 + (alt1 - 500) * 411.657894736
    ;} else 
        if ( alt1 <= 788 ) { 
     VolTk = 326708 + (alt1 - 576) * 411.660377358
    ;} else 
        if ( alt1 <= 1000 ) { 
     VolTk = 413980 + (alt1 - 788) * 411.655660377
    ;} else 
        if ( alt1 <= 1043 ) { 
     VolTk = 501251 + (alt1 - 1000) * 411.581395348
    ;} else 
        if ( alt1 <= 1085 ) { 
     VolTk = 518949 + (alt1 - 1043) * 411.571428571
    ;} else 
        if ( alt1 <= 1227 ) { 
     VolTk = 536235 + (alt1 - 1085) * 411.507042253
    ;} else 
        if ( alt1 <= 1368 ) { 
     VolTk = 594669 + (alt1 - 1227) * 411.503546099
    ;} else 
        if ( alt1 <= 1556 ) { 
     VolTk = 652691 + (alt1 - 1368) * 411.654255319
    ;} else 
        if ( alt1 <= 1744 ) { 
     VolTk = 730082 + (alt1 - 1556) * 411.659574468
    ;} else 
        if ( alt1 <= 1932 ) { 
     VolTk = 807474 + (alt1 - 1744) * 411.659574468
    ;} else 
        if ( alt1 <= 2119 ) { 
     VolTk = 884866 + (alt1 - 1932) * 411.65775401
    ;} else 
        if ( alt1 <= 2307 ) { 
     VolTk = 961846 + (alt1 - 2119) * 411.659574468
    ;} else 
        if ( alt1 <= 2495 ) { 
     VolTk = 1039238 + (alt1 - 2307) * 411.659574468
    ;} else 
        if ( alt1 <= 2683 ) { 
     VolTk = 1116630 + (alt1 - 2495) * 411.659574468
    ;} else 
        if ( alt1 <= 2870 ) { 
     VolTk = 1194022 + (alt1 - 2683) * 411.65775401
    ;} else 
        if ( alt1 <= 3058 ) { 
     VolTk = 1271002 + (alt1 - 2870) * 411.728723404
    ;} else 
        if ( alt1 <= 3246 ) { 
     VolTk = 1348407 + (alt1 - 3058) * 411.723404255
    ;} else 
        if ( alt1 <= 3434 ) { 
     VolTk = 1425811 + (alt1 - 3246) * 411.728723404
    ;} else 
        if ( alt1 <= 3622 ) { 
     VolTk = 1503216 + (alt1 - 3434) * 411.723404255
    ;} else 
        if ( alt1 <= 3810 ) { 
     VolTk = 1580620 + (alt1 - 3622) * 411.728723404
    ;} else 
        if ( alt1 <= 3998 ) { 
     VolTk = 1658025 + (alt1 - 3810) * 411.723404255
    ;} else 
        if ( alt1 <= 4186 ) { 
     VolTk = 1735429 + (alt1 - 3998) * 411.728723404
    ;} else 
        if ( alt1 <= 4373 ) { 
     VolTk = 1812834 + (alt1 - 4186) * 411.721925133
    ;} else 
        if ( alt1 <= 4561 ) { 
     VolTk = 1889826 + (alt1 - 4373) * 411.420212765
    ;} else 
        if ( alt1 <= 4748 ) { 
     VolTk = 1967173 + (alt1 - 4561) * 411.422459893
    ;} else 
        if ( alt1 <= 4935 ) { 
     VolTk = 2044109 + (alt1 - 4748) * 411.417112299
    ;} else 
        if ( alt1 <= 5122 ) { 
     VolTk = 2121044 + (alt1 - 4935) * 411.427807486
    ;} else 
        if ( alt1 <= 5310 ) { 
     VolTk = 2197981 + (alt1 - 5122) * 411.420212765
    ;} else 
        if ( alt1 <= 5497 ) { 
     VolTk = 2275328 + (alt1 - 5310) * 411.422459893
    ;} else 
        if ( alt1 <= 5684 ) { 
     VolTk = 2352264 + (alt1 - 5497) * 411.417112299
    ;} else 
        if ( alt1 <= 5871 ) { 
     VolTk = 2429199 + (alt1 - 5684) * 411.422459893
    ;} else 
        if ( alt1 <= 6059 ) { 
     VolTk = 2506135 + (alt1 - 5871) * 411.44680851
    ;} else 
        if ( alt1 <= 6247 ) { 
     VolTk = 2583487 + (alt1 - 6059) * 411.441489361
    ;} else 
        if ( alt1 <= 6435 ) { 
     VolTk = 2660838 + (alt1 - 6247) * 411.441489361
    ;} else 
        if ( alt1 <= 6623 ) { 
     VolTk = 2738189 + (alt1 - 6435) * 411.44680851
    ;} else 
        if ( alt1 <= 6811 ) { 
     VolTk = 2815541 + (alt1 - 6623) * 411.441489361
    ;} else 
        if ( alt1 <= 6999 ) { 
     VolTk = 2892892 + (alt1 - 6811) * 411.441489361
    ;} else 
        if ( alt1 <= 7187 ) { 
     VolTk = 2970243 + (alt1 - 6999) * 411.44680851
    ;} else 
        if ( alt1 <= 7374 ) { 
     VolTk = 3047595 + (alt1 - 7187) * 411.443850267
    ;} else 
        if ( alt1 <= 7562 ) { 
     VolTk = 3124535 + (alt1 - 7374) * 411.526595744
    ;} else 
        if ( alt1 <= 7749 ) { 
     VolTk = 3201902 + (alt1 - 7562) * 411.529411764
    ;} else 
        if ( alt1 <= 7937 ) { 
     VolTk = 3278858 + (alt1 - 7749) * 411.526595744
    ;} else 
        if ( alt1 <= 8124 ) { 
     VolTk = 3356225 + (alt1 - 7937) * 411.529411764
    ;} else 
        if ( alt1 <= 8312 ) { 
     VolTk = 3433181 + (alt1 - 8124) * 411.526595744
    ;} else 
        if ( alt1 <= 8499 ) { 
     VolTk = 3510548 + (alt1 - 8312) * 411.524064171
    ;} else 
        if ( alt1 <= 8687 ) { 
     VolTk = 3587503 + (alt1 - 8499) * 411.531914893
    ;} else 
        if ( alt1 <= 8874 ) { 
     VolTk = 3664871 + (alt1 - 8687) * 411.524064171
    ;} else 
        if ( alt1 <= 9062 ) { 
     VolTk = 3741826 + (alt1 - 8874) * 412.042553191
    ;} else 
        if ( alt1 <= 9249 ) { 
     VolTk = 3819290 + (alt1 - 9062) * 412.042780748
    ;} else 
        if ( alt1 <= 9436 ) { 
     VolTk = 3896342 + (alt1 - 9249) * 412.042780748
    ;} else 
        if ( alt1 <= 9623 ) { 
     VolTk = 3973394 + (alt1 - 9436) * 412.042780748
    ;} else 
        if ( alt1 <= 9811 ) { 
     VolTk = 4050446 + (alt1 - 9623) * 412.042553191
    ;} else 
        if ( alt1 <= 9998 ) { 
     VolTk = 4127910 + (alt1 - 9811) * 412.042780748
    ;} else 
        if ( alt1 <= 10185 ) { 
     VolTk = 4204962 + (alt1 - 9998) * 412.042780748
    ;} else 
        if ( alt1 <= 10372 ) { 
     VolTk = 4282014 + (alt1 - 10185) * 412.042780748
    ;} else 
        if ( alt1 <= 10567 ) { 
     VolTk = 4359066 + (alt1 - 10372) * 412.005128205
    ;} else 
        if ( alt1 <= 10762 ) { 
     VolTk = 4439407 + (alt1 - 10567) * 412
    ;} else 
        if ( alt1 <= 10957 ) { 
     VolTk = 4519747 + (alt1 - 10762) * 412.005128205
    ;} else 
        if ( alt1 <= 11152 ) { 
     VolTk = 4600088 + (alt1 - 10957) * 412
    ;} else 
        if ( alt1 <= 11542 ) { 
     VolTk = 4680428 + (alt1 - 11152) * 412.002564102
    ;} else 
        if ( alt1 <= 11940 ) { 
     VolTk = 4841109 + (alt1 - 11542) * 412.005025125;
        }
        }
    if ( Tk == 3 ) { 
    
        alt1 = (127960 - Altura);
    
      if ( alt1 <= 110 ) { 
     VolTk = 18410 + (alt1 - 0) * 205.66363636
    ;} else 
        if ( alt1 <= 160 ) { 
     VolTk = 41033 + (alt1 - 110) * 205.58
    ;} else 
        if ( alt1 <= 180 ) { 
     VolTk = 51312 + (alt1 - 160) * 205.1
    ;} else 
        if ( alt1 <= 240 ) { 
     VolTk = 55414 + (alt1 - 180) * 204.6
    ;} else 
        if ( alt1 <= 260 ) { 
     VolTk = 67690 + (alt1 - 240) * 203.95
    ;} else 
        if ( alt1 <= 314 ) { 
     VolTk = 71769 + (alt1 - 260) * 204.5185185
    ;} else 
        if ( alt1 <= 340 ) { 
     VolTk = 82813 + (alt1 - 314) * 204.576923076
    ;} else 
        if ( alt1 <= 375 ) { 
     VolTk = 88132 + (alt1 - 340) * 205.228571428
    ;} else 
        if ( alt1 <= 405 ) { 
     VolTk = 95315 + (alt1 - 375) * 205.3
    ;} else 
        if ( alt1 <= 585 ) { 
     VolTk = 101474 + (alt1 - 405) * 205.39444444
    ;} else 
        if ( alt1 <= 820 ) { 
     VolTk = 138445 + (alt1 - 585) * 204.263829787
    ;} else 
        if ( alt1 <= 1035 ) { 
     VolTk = 186447 + (alt1 - 820) * 205.865116279
    ;} else 
        if ( alt1 <= 1165 ) { 
     VolTk = 230708 + (alt1 - 1035) * 205.784615384
    ;} else 
        if ( alt1 <= 1462 ) { 
     VolTk = 257460 + (alt1 - 1165) * 205.696969696
    ;} else 
        if ( alt1 <= 1662 ) { 
     VolTk = 318552 + (alt1 - 1462) * 205.74
    ;} else 
        if ( alt1 <= 1862 ) { 
     VolTk = 359700 + (alt1 - 1662) * 205.745
    ;} else 
        if ( alt1 <= 2112 ) { 
     VolTk = 400849 + (alt1 - 1862) * 205.752
    ;} else 
        if ( alt1 <= 2412 ) { 
     VolTk = 452287 + (alt1 - 2112) * 205.763333333
    ;} else 
        if ( alt1 <= 2722 ) { 
     VolTk = 514016 + (alt1 - 2412) * 205.770967741
    ;} else 
        if ( alt1 <= 2972 ) { 
     VolTk = 577805 + (alt1 - 2722) * 205.788
    ;} else 
        if ( alt1 <= 3272 ) { 
     VolTk = 629252 + (alt1 - 2972) * 206.0133333333
    ;} else 
        if ( alt1 <= 3572 ) { 
     VolTk = 691056 + (alt1 - 3272) * 206.023333333
    ;} else 
        if ( alt1 <= 3882 ) { 
     VolTk = 752863 + (alt1 - 3572) * 206.0322581
    ;} else 
        if ( alt1 <= 4192 ) { 
     VolTk = 816733 + (alt1 - 3882) * 206.0451613
    ;} else 
        if ( alt1 <= 4542 ) { 
     VolTk = 880607 + (alt1 - 4192) * 206.057143
    ;} else 
        if ( alt1 <= 4942 ) { 
     VolTk = 952727 + (alt1 - 4542) * 206.0775
    ;} else 
        if ( alt1 <= 5342 ) { 
     VolTk = 1035158 + (alt1 - 4942) * 206.0975
    ;} else 
        if ( alt1 <= 5742 ) { 
     VolTk = 1117597 + (alt1 - 5342) * 206.115
    ;} else 
        if ( alt1 <= 5992 ) { 
     VolTk = 1200043 + (alt1 - 5742) * 206.12
    ;} else 
        if ( alt1 <= 6292 ) { 
     VolTk = 1251573 + (alt1 - 5992) * 206.063333333
    ;} else 
        if ( alt1 <= 6692 ) { 
     VolTk = 1313392 + (alt1 - 6292) * 206.08
    ;} else 
        if ( alt1 <= 7092 ) { 
     VolTk = 1395824 + (alt1 - 6692) * 206.1025
    ;} else 
        if ( alt1 <= 7492 ) { 
     VolTk = 1478265 + (alt1 - 7092) * 206.1225
    ;} else 
        if ( alt1 <= 7892 ) { 
     VolTk = 1560714 + (alt1 - 7492) * 206.1175
    ;} else 
        if ( alt1 <= 8292 ) { 
     VolTk = 1643161 + (alt1 - 7892) * 206.1375
    ;} else 
        if ( alt1 <= 8692 ) { 
     VolTk = 1725616 + (alt1 - 8292) * 206.155
    ;} else 
        if ( alt1 <= 8942 ) { 
     VolTk = 1808078 + (alt1 - 8692) * 206.168
    ;} else 
        if ( alt1 <= 9242 ) { 
     VolTk = 1859620 + (alt1 - 8942) * 206.06
    ;} else 
        if ( alt1 <= 9642 ) { 
     VolTk = 1921438 + (alt1 - 9242) * 206.06
    ;} else 
        if ( alt1 <= 10042 ) { 
     VolTk = 2003862 + (alt1 - 9642) * 206.0575
    ;} else 
        if ( alt1 <= 10442 ) { 
     VolTk = 2086285 + (alt1 - 10042) * 206.055
    ;} else 
        if ( alt1 <= 10842 ) { 
     VolTk = 2168707 + (alt1 - 10442) * 206.21
    ;} else 
        if ( alt1 <= 11242 ) { 
     VolTk = 2251191 + (alt1 - 10842) * 206.2125
    ;} else 
        if ( alt1 <= 11642 ) { 
     VolTk = 2333676 + (alt1 - 11242) * 206.2125
    ;} else 
        if ( alt1 <= 12012 ) { 
     VolTk = 2416161 + (alt1 - 11642) * 206.213513513;
        }
        }
     if ( Tk == 4 ) { 
    
        alt1 = (124230 - Altura);
    
      if ( alt1 <= 145 ) { 
     VolTk = 11579 + (alt1 - 0) * 105.2206897
    ;} else 
        if ( alt1 <= 224 ) { 
     VolTk = 26836 + (alt1 - 145) * 105.0632911
    ;} else 
        if ( alt1 <= 231 ) { 
     VolTk = 35136 + (alt1 - 224) * 105.1428571
    ;} else 
        if ( alt1 <= 315 ) { 
     VolTk = 35872 + (alt1 - 231) * 105.2142857
    ;} else 
        if ( alt1 <= 375 ) { 
     VolTk = 44710 + (alt1 - 315) * 105.1333333
    ;} else 
        if ( alt1 <= 420 ) { 
     VolTk = 51018 + (alt1 - 375) * 105.2222222
    ;} else 
        if ( alt1 <= 879 ) { 
     VolTk = 55753 + (alt1 - 420) * 105.379085
    ;} else 
        if ( alt1 <= 885 ) { 
     VolTk = 104122 + (alt1 - 879) * 105.1666667
    ;} else 
        if ( alt1 <= 1295 ) { 
     VolTk = 104753 + (alt1 - 885) * 105.2439024
    ;} else 
        if ( alt1 <= 1670 ) { 
     VolTk = 147903 + (alt1 - 1295) * 105.3653333
    ;} else 
        if ( alt1 <= 2045 ) { 
     VolTk = 187415 + (alt1 - 1670) * 105.376
    ;} else 
        if ( alt1 <= 2420 ) { 
     VolTk = 226931 + (alt1 - 2045) * 105.384
    ;} else 
        if ( alt1 <= 2795 ) { 
     VolTk = 266450 + (alt1 - 2420) * 105.392
    ;} else 
        if ( alt1 <= 3171 ) { 
     VolTk = 305972 + (alt1 - 2795) * 105.3031915
    ;} else 
        if ( alt1 <= 3546 ) { 
     VolTk = 345566 + (alt1 - 3171) * 105.312
    ;} else 
        if ( alt1 <= 3922 ) { 
     VolTk = 385058 + (alt1 - 3546) * 105.3218085
    ;} else 
        if ( alt1 <= 4297 ) { 
     VolTk = 424659 + (alt1 - 3922) * 105.3306667
    ;} else 
        if ( alt1 <= 4673 ) { 
     VolTk = 464158 + (alt1 - 4297) * 105.3537234
    ;} else 
        if ( alt1 <= 5048 ) { 
     VolTk = 503771 + (alt1 - 4673) * 105.3626667
    ;} else 
        if ( alt1 <= 5424 ) { 
     VolTk = 543282 + (alt1 - 5048) * 105.3723404
    ;} else 
        if ( alt1 <= 5799 ) { 
     VolTk = 582902 + (alt1 - 5424) * 105.3786667
    ;} else 
        if ( alt1 <= 6174 ) { 
     VolTk = 622419 + (alt1 - 5799) * 105.3066667
    ;} else 
        if ( alt1 <= 6549 ) { 
     VolTk = 661909 + (alt1 - 6174) * 105.3173333
    ;} else 
        if ( alt1 <= 6924 ) { 
     VolTk = 701403 + (alt1 - 6549) * 105.3253333
    ;} else 
        if ( alt1 <= 7299 ) { 
     VolTk = 740900 + (alt1 - 6924) * 105.3333333
    ;} else 
        if ( alt1 <= 7676 ) { 
     VolTk = 780400 + (alt1 - 7299) * 105.2068966
    ;} else 
        if ( alt1 <= 8052 ) { 
     VolTk = 820063 + (alt1 - 7676) * 105.2154255
    ;} else 
        if ( alt1 <= 8428 ) { 
     VolTk = 859624 + (alt1 - 8052) * 105.2234043
    ;} else 
        if ( alt1 <= 8804 ) { 
     VolTk = 899188 + (alt1 - 8428) * 105.2340426
    ;} else 
        if ( alt1 <= 10297 ) { 
     VolTk = 938756 + (alt1 - 8804) * 105.2458138
    ;} else 
        if ( alt1 <= 11517 ) { 
     VolTk = 1095888 + (alt1 - 10297) * 105.3622951;
        }
        }
    if ( Tk == 5 ) { 
    
        alt1 = (127410 - Altura);
    
    if ( alt1 <= 50 ) { 
     VolTk = 22000 + (alt1 - 0) * 110.1
    ;} else 
    if ( alt1 <= 75 ) { 
     VolTk = 27505 + (alt1 - 50) * 110.08
    ;} else 
    if ( alt1 <= 88 ) { 
     VolTk = 30257 + (alt1 - 75) * 110.0769231
    ;} else 
    if ( alt1 <= 100 ) { 
     VolTk = 31688 + (alt1 - 88) * 109.75
    ;} else 
    if ( alt1 <= 200 ) { 
     VolTk = 33005 + (alt1 - 100) * 109.95
    ;} else 
    if ( alt1 <= 300 ) { 
     VolTk = 44000 + (alt1 - 200) * 110.01
    ;} else 
    if ( alt1 <= 400 ) { 
     VolTk = 55001 + (alt1 - 300) * 110.05
    ;} else 
    if ( alt1 <= 500 ) { 
     VolTk = 66006 + (alt1 - 400) * 110.2
    ;} else 
    if ( alt1 <= 600 ) { 
     VolTk = 77026 + (alt1 - 500) * 110.26
    ;} else 
    if ( alt1 <= 700 ) { 
     VolTk = 88052 + (alt1 - 600) * 110.25
    ;} else 
    if ( alt1 <= 750 ) { 
     VolTk = 99077 + (alt1 - 700) * 110.24
    ;} else 
    if ( alt1 <= 800 ) { 
     VolTk = 104589 + (alt1 - 750) * 110.3
    ;} else 
    if ( alt1 <= 900 ) { 
     VolTk = 110104 + (alt1 - 800) * 110.25
    ;} else 
    if ( alt1 <= 1000 ) { 
     VolTk = 121129 + (alt1 - 900) * 110.26
    ;} else 
    if ( alt1 <= 1100 ) { 
     VolTk = 132155 + (alt1 - 1000) * 110.21
    ;} else 
    if ( alt1 <= 1200 ) { 
     VolTk = 143176 + (alt1 - 1100) * 110.18
    ;} else 
    if ( alt1 <= 1300 ) { 
     VolTk = 154194 + (alt1 - 1200) * 110.11
    ;} else 
    if ( alt1 <= 1325 ) { 
     VolTk = 165205 + (alt1 - 1300) * 110.12
    ;} else 
    if ( alt1 <= 1338 ) { 
     VolTk = 167958 + (alt1 - 1325) * 110.0769231
    ;} else 
    if ( alt1 <= 1340 ) { 
     VolTk = 169389 + (alt1 - 1338) * 110.5
    ;} else 
    if ( alt1 <= 1341 ) { 
     VolTk = 169610 + (alt1 - 1340) * 105
    ;} else 
    if ( alt1 <= 1344 ) { 
     VolTk = 169715 + (alt1 - 1341) * 105
    ;} else 
    if ( alt1 <= 1350 ) { 
     VolTk = 170030 + (alt1 - 1344) * 105
    ;} else 
    if ( alt1 <= 1400 ) { 
     VolTk = 170660 + (alt1 - 1350) * 105.04
    ;} else 
    if ( alt1 <= 1500 ) { 
     VolTk = 175912 + (alt1 - 1400) * 105.01
    ;} else 
    if ( alt1 <= 1600 ) { 
     VolTk = 186413 + (alt1 - 1500) * 105.01
    ;} else 
    if ( alt1 <= 1700 ) { 
     VolTk = 196914 + (alt1 - 1600) * 110.07
    ;} else 
    if ( alt1 <= 1800 ) { 
     VolTk = 207921 + (alt1 - 1700) * 110.09
    ;} else 
    if ( alt1 <= 1900 ) { 
     VolTk = 218930 + (alt1 - 1800) * 110.07
    ;} else 
    if ( alt1 <= 2000 ) { 
     VolTk = 229937 + (alt1 - 1900) * 110.08
    ;} else 
    if ( alt1 <= 2100 ) { 
     VolTk = 240945 + (alt1 - 2000) * 110.09
    ;} else 
    if ( alt1 <= 2200 ) { 
     VolTk = 251954 + (alt1 - 2100) * 110.08
    ;} else 
    if ( alt1 <= 2300 ) { 
     VolTk = 262962 + (alt1 - 2200) * 110.09
    ;} else 
    if ( alt1 <= 2400 ) { 
     VolTk = 273971 + (alt1 - 2300) * 110.09
    ;} else 
    if ( alt1 <= 2500 ) { 
     VolTk = 284980 + (alt1 - 2400) * 110.09
    ;} else 
    if ( alt1 <= 2600 ) { 
     VolTk = 295989 + (alt1 - 2500) * 110.09
    ;} else 
    if ( alt1 <= 2700 ) { 
     VolTk = 306998 + (alt1 - 2600) * 110.1
    ;} else 
    if ( alt1 <= 2800 ) { 
     VolTk = 318008 + (alt1 - 2700) * 110.09
    ;} else 
    if ( alt1 <= 2850 ) { 
     VolTk = 329017 + (alt1 - 2800) * 110.1
    ;} else 
    if ( alt1 <= 2900 ) { 
     VolTk = 334522 + (alt1 - 2850) * 110.16
    ;} else 
    if ( alt1 <= 3000 ) { 
     VolTk = 340030 + (alt1 - 2900) * 110.17
    ;} else 
    if ( alt1 <= 3100 ) { 
     VolTk = 351047 + (alt1 - 3000) * 110.18
    ;} else 
    if ( alt1 <= 3200 ) { 
     VolTk = 362065 + (alt1 - 3100) * 110.17
    ;} else 
    if ( alt1 <= 3300 ) { 
     VolTk = 373082 + (alt1 - 3200) * 110.18
    ;} else 
    if ( alt1 <= 3400 ) { 
     VolTk = 384100 + (alt1 - 3300) * 110.17
    ;} else 
    if ( alt1 <= 3500 ) { 
     VolTk = 395117 + (alt1 - 3400) * 110.19
    ;} else 
    if ( alt1 <= 3600 ) { 
     VolTk = 406136 + (alt1 - 3500) * 110.17
    ;} else 
    if ( alt1 <= 3700 ) { 
     VolTk = 417153 + (alt1 - 3600) * 110.19
    ;} else 
    if ( alt1 <= 3800 ) { 
     VolTk = 428172 + (alt1 - 3700) * 110.18
    ;} else 
    if ( alt1 <= 3900 ) { 
     VolTk = 439190 + (alt1 - 3800) * 110.18
    ;} else 
    if ( alt1 <= 4000 ) { 
     VolTk = 450208 + (alt1 - 3900) * 110.2
    ;} else 
    if ( alt1 <= 4100 ) { 
     VolTk = 461228 + (alt1 - 4000) * 110.18
    ;} else 
    if ( alt1 <= 4200 ) { 
     VolTk = 472246 + (alt1 - 4100) * 110.2
    ;} else 
    if ( alt1 <= 4300 ) { 
     VolTk = 483266 + (alt1 - 4200) * 110.18
    ;} else 
    if ( alt1 <= 4400 ) { 
     VolTk = 494284 + (alt1 - 4300) * 110.22
    ;} else 
    if ( alt1 <= 4500 ) { 
     VolTk = 505306 + (alt1 - 4400) * 110.21
    ;} else 
    if ( alt1 <= 4600 ) { 
     VolTk = 516327 + (alt1 - 4500) * 110.23
    ;} else 
    if ( alt1 <= 4700 ) { 
     VolTk = 527350 + (alt1 - 4600) * 110.22
    ;} else 
    if ( alt1 <= 4800 ) { 
     VolTk = 538372 + (alt1 - 4700) * 110.23
    ;} else 
    if ( alt1 <= 4900 ) { 
     VolTk = 549395 + (alt1 - 4800) * 110.22
    ;} else 
    if ( alt1 <= 5000 ) { 
     VolTk = 560417 + (alt1 - 4900) * 110.24
    ;} else 
    if ( alt1 <= 5100 ) { 
     VolTk = 571441 + (alt1 - 5000) * 110.22
    ;} else 
    if ( alt1 <= 5200 ) { 
     VolTk = 582463 + (alt1 - 5100) * 110.24
    ;} else 
    if ( alt1 <= 5300 ) { 
     VolTk = 593487 + (alt1 - 5200) * 110.23
    ;} else 
    if ( alt1 <= 5400 ) { 
     VolTk = 604510 + (alt1 - 5300) * 110.24
    ;} else 
    if ( alt1 <= 5500 ) { 
     VolTk = 615534 + (alt1 - 5400) * 110.23
    ;} else 
    if ( alt1 <= 5600 ) { 
     VolTk = 626557 + (alt1 - 5500) * 110.24
    ;} else 
    if ( alt1 <= 5700 ) { 
     VolTk = 637581 + (alt1 - 5600) * 110.24
    ;} else 
    if ( alt1 <= 5800 ) { 
     VolTk = 648605 + (alt1 - 5700) * 110.24
    ;} else 
    if ( alt1 <= 5900 ) { 
     VolTk = 659629 + (alt1 - 5800) * 110.26
    ;} else 
    if ( alt1 <= 6000 ) { 
     VolTk = 670655 + (alt1 - 5900) * 110.27
    ;} else 
    if ( alt1 <= 6100 ) { 
     VolTk = 681682 + (alt1 - 6000) * 110.28
    ;} else 
    if ( alt1 <= 6200 ) { 
     VolTk = 692710 + (alt1 - 6100) * 110.27
    ;} else 
    if ( alt1 <= 6300 ) { 
     VolTk = 703737 + (alt1 - 6200) * 110.28
    ;} else 
    if ( alt1 <= 6400 ) { 
     VolTk = 714765 + (alt1 - 6300) * 110.27
    ;} else 
    if ( alt1 <= 6500 ) { 
     VolTk = 725792 + (alt1 - 6400) * 110.29
    ;} else 
    if ( alt1 <= 6600 ) { 
     VolTk = 736821 + (alt1 - 6500) * 110.27
    ;} else 
    if ( alt1 <= 6700 ) { 
     VolTk = 747848 + (alt1 - 6600) * 110.29
    ;} else 
    if ( alt1 <= 6800 ) { 
     VolTk = 758877 + (alt1 - 6700) * 110.28
    ;} else 
    if ( alt1 <= 6900 ) { 
     VolTk = 769905 + (alt1 - 6800) * 110.29
    ;} else 
    if ( alt1 <= 7000 ) { 
     VolTk = 780934 + (alt1 - 6900) * 110.29
    ;} else 
    if ( alt1 <= 7100 ) { 
     VolTk = 791963 + (alt1 - 7000) * 110.29
    ;} else 
    if ( alt1 <= 7200 ) { 
     VolTk = 802992 + (alt1 - 7100) * 110.29
    ;} else 
    if ( alt1 <= 7300 ) { 
     VolTk = 814021 + (alt1 - 7200) * 110.29
    ;} else 
    if ( alt1 <= 7400 ) { 
     VolTk = 825050 + (alt1 - 7300) * 110.25
    ;} else 
    if ( alt1 <= 7500 ) { 
     VolTk = 836075 + (alt1 - 7400) * 110.23
    ;} else 
    if ( alt1 <= 7600 ) { 
     VolTk = 847098 + (alt1 - 7500) * 110.23
    ;} else 
    if ( alt1 <= 7700 ) { 
     VolTk = 858121 + (alt1 - 7600) * 110.24
    ;} else 
    if ( alt1 <= 7800 ) { 
     VolTk = 869145 + (alt1 - 7700) * 110.23
    ;} else 
    if ( alt1 <= 7900 ) { 
     VolTk = 880168 + (alt1 - 7800) * 110.23
    ;} else 
    if ( alt1 <= 8000 ) { 
     VolTk = 891191 + (alt1 - 7900) * 110.24
    ;} else 
    if ( alt1 <= 8100 ) { 
     VolTk = 902215 + (alt1 - 8000) * 110.23
    ;} else 
    if ( alt1 <= 8200 ) { 
     VolTk = 913238 + (alt1 - 8100) * 110.24
    ;} else 
    if ( alt1 <= 8300 ) { 
     VolTk = 924262 + (alt1 - 8200) * 110.23
    ;} else 
    if ( alt1 <= 8400 ) { 
     VolTk = 935285 + (alt1 - 8300) * 110.24
    ;} else 
    if ( alt1 <= 8500 ) { 
     VolTk = 946309 + (alt1 - 8400) * 110.23
    ;} else 
    if ( alt1 <= 8600 ) { 
     VolTk = 957332 + (alt1 - 8500) * 110.24
    ;} else 
    if ( alt1 <= 8700 ) { 
     VolTk = 968356 + (alt1 - 8600) * 110.23
    ;} else 
    if ( alt1 <= 8800 ) { 
     VolTk = 979379 + (alt1 - 8700) * 110.24
    ;} else 
    if ( alt1 <= 8900 ) { 
     VolTk = 990403 + (alt1 - 8800) * 110.21
    ;} else 
    if ( alt1 <= 9000 ) { 
     VolTk = 1001424 + (alt1 - 8900) * 110.23
    ;} else 
    if ( alt1 <= 9100 ) { 
     VolTk = 1012447 + (alt1 - 9000) * 110.21
    ;} else 
    if ( alt1 <= 9200 ) { 
     VolTk = 1023468 + (alt1 - 9100) * 110.23
    ;} else 
    if ( alt1 <= 9300 ) { 
     VolTk = 1034491 + (alt1 - 9200) * 110.21
    ;} else 
    if ( alt1 <= 9400 ) { 
     VolTk = 1045512 + (alt1 - 9300) * 110.23
    ;} else 
    if ( alt1 <= 9500 ) { 
     VolTk = 1056535 + (alt1 - 9400) * 110.21
    ;} else 
    if ( alt1 <= 9600 ) { 
     VolTk = 1067556 + (alt1 - 9500) * 110.22
    ;} else 
    if ( alt1 <= 9700 ) { 
     VolTk = 1078578 + (alt1 - 9600) * 110.22
    ;} else 
    if ( alt1 <= 9800 ) { 
     VolTk = 1089600 + (alt1 - 9700) * 110.22
    ;} else 
    if ( alt1 <= 9900 ) { 
     VolTk = 1100622 + (alt1 - 9800) * 110.22
    ;} else 
    if ( alt1 <= 10000 ) { 
     VolTk = 1111644 + (alt1 - 9900) * 110.22
    ;} else 
    if ( alt1 <= 10100 ) { 
     VolTk = 1122666 + (alt1 - 10000) * 110.22
    ;} else 
    if ( alt1 <= 10200 ) { 
     VolTk = 1133688 + (alt1 - 10100) * 110.22
    ;} else 
    if ( alt1 <= 10300 ) { 
     VolTk = 1144710 + (alt1 - 10200) * 110.22
    ;} else 
    if ( alt1 <= 10400 ) { 
     VolTk = 1155732 + (alt1 - 10300) * 110.22
    ;} else 
    if ( alt1 <= 10500 ) { 
     VolTk = 1166754 + (alt1 - 10400) * 110.22
    ;} else 
    if ( alt1 <= 10600 ) { 
     VolTk = 1177776 + (alt1 - 10500) * 110.22
    ;} else 
    if ( alt1 <= 10700 ) { 
     VolTk = 1188798 + (alt1 - 10600) * 110.23
    ;} else 
    if ( alt1 <= 10800 ) { 
     VolTk = 1199821 + (alt1 - 10700) * 110.21
    ;} else 
    if ( alt1 <= 10900 ) { 
     VolTk = 1210842 + (alt1 - 10800) * 110.22
    ;} else 
    if ( alt1 <= 11000 ) { 
     VolTk = 1221864 + (alt1 - 10900) * 110.22
    ;} else 
    if ( alt1 <= 11100 ) { 
     VolTk = 1232886 + (alt1 - 11000) * 110.23
    ;} else 
    if ( alt1 <= 11200 ) { 
     VolTk = 1243909 + (alt1 - 11100) * 110.21
    ;} else 
    if ( alt1 <= 11300 ) { 
     VolTk = 1254930 + (alt1 - 11200) * 110.23
    ;} else 
    if ( alt1 <= 11400 ) { 
     VolTk = 1265953 + (alt1 - 11300) * 110.21
    ;} else 
    if ( alt1 <= 11500 ) { 
     VolTk = 1276974 + (alt1 - 11400) * 110.22
    ;} else 
    if ( alt1 <= 11600 ) { 
     VolTk = 1287996 + (alt1 - 11500) * 110.22
    ;} else 
    if ( alt1 <= 11700 ) { 
     VolTk = 1299018 + (alt1 - 11600) * 110.22
    ;} else 
    if ( alt1 <= 11782 ) { 
     VolTk = 1310040 + (alt1 - 11700) * 110.2195122;
        }
        }
    if ( Tk == 6 ) { 
    
		alt1 = (123090 - Altura);
    
      if ( alt1 <= 80 ) { 
     VolTk = 6540 + (alt1 - 0) * 81.5375
     ;} else 
        if ( alt1 <= 140 ) { 
     VolTk = 13063 + (alt1 - 80) * 81.5333333333
    ;} else 
        if ( alt1 <= 200 ) { 
     VolTk = 17955 + (alt1 - 140) * 81.4833333333
    ;} else 
        if ( alt1 <= 233 ) { 
     VolTk = 22844 + (alt1 - 200) * 81.5454545454
    ;} else 
        if ( alt1 <= 283 ) { 
     VolTk = 25535 + (alt1 - 233) * 81.48
    ;} else 
        if ( alt1 <= 356 ) { 
     VolTk = 29609 + (alt1 - 283) * 81.5342465753
    ;} else 
        if ( alt1 <= 362 ) { 
     VolTk = 35561 + (alt1 - 356) * 81.666666666
    ;} else 
        if ( alt1 <= 450 ) { 
     VolTk = 36051 + (alt1 - 362) * 81.6931818181
    ;} else 
        if ( alt1 <= 550 ) { 
     VolTk = 43240 + (alt1 - 450) * 81.88
    ;} else 
        if ( alt1 <= 750 ) { 
     VolTk = 51428 + (alt1 - 550) * 81.885
    ;} else 
        if ( alt1 <= 850 ) { 
     VolTk = 67805 + (alt1 - 750) * 81.88
    ;} else 
        if ( alt1 <= 880 ) { 
     VolTk = 75993 + (alt1 - 850) * 81.8666666666
    ;} else 
        if ( alt1 <= 890 ) { 
     VolTk = 78449 + (alt1 - 880) * 81.9
    ;} else 
        if ( alt1 <= 900 ) { 
     VolTk = 79268 + (alt1 - 890) * 81
    ;} else 
        if ( alt1 <= 950 ) { 
     VolTk = 80078 + (alt1 - 900) * 80.18
    ;} else 
        if ( alt1 <= 1050 ) { 
     VolTk = 84087 + (alt1 - 950) * 80.04
    ;} else 
        if ( alt1 <= 1200 ) { 
     VolTk = 92091 + (alt1 - 1050) * 80.0266666666
    ;} else 
        if ( alt1 <= 1450 ) { 
     VolTk = 104095 + (alt1 - 1200) * 81.724
    ;} else 
        if ( alt1 <= 1750 ) { 
     VolTk = 124526 + (alt1 - 1450) * 81.72
    ;} else 
        if ( alt1 <= 2100 ) { 
     VolTk = 149042 + (alt1 - 1750) * 81.72
    ;} else 
        if ( alt1 <= 2500 ) { 
     VolTk = 177644 + (alt1 - 2100) * 81.7175
    ;} else 
        if ( alt1 <= 2900 ) { 
     VolTk = 210331 + (alt1 - 2500) * 81.7225
    ;} else 
        if ( alt1 <= 3300 ) { 
     VolTk = 243020 + (alt1 - 2900) * 81.7375
    ;} else 
        if ( alt1 <= 3750 ) { 
     VolTk = 275715 + (alt1 - 3300) * 81.7355555555
    ;} else 
        if ( alt1 <= 4200 ) { 
     VolTk = 312496 + (alt1 - 3750) * 81.7377777777
    ;} else 
        if ( alt1 <= 4650 ) { 
     VolTk = 349278 + (alt1 - 4200) * 81.7444444444
    ;} else 
        if ( alt1 <= 5150 ) { 
     VolTk = 386063 + (alt1 - 4650) * 81.748
    ;} else 
        if ( alt1 <= 5650 ) { 
     VolTk = 426937 + (alt1 - 5150) * 81.75
    ;} else 
        if ( alt1 <= 6000 ) { 
     VolTk = 467812 + (alt1 - 5650) * 81.7628571428
    ;} else 
        if ( alt1 <= 6350 ) { 
     VolTk = 496429 + (alt1 - 6000) * 81.7885714285
    ;} else 
        if ( alt1 <= 6750 ) { 
     VolTk = 525055 + (alt1 - 6350) * 81.7875
    ;} else 
        if ( alt1 <= 7150 ) { 
     VolTk = 557770 + (alt1 - 6750) * 81.7875
    ;} else 
        if ( alt1 <= 7550 ) { 
     VolTk = 590485 + (alt1 - 7150) * 81.7825
    ;} else 
        if ( alt1 <= 7950 ) { 
     VolTk = 623198 + (alt1 - 7550) * 81.77
    ;} else 
        if ( alt1 <= 8350 ) { 
     VolTk = 655906 + (alt1 - 7950) * 81.7725
    ;} else 
        if ( alt1 <= 8750 ) { 
     VolTk = 688615 + (alt1 - 8350) * 81.77
    ;} else 
        if ( alt1 <= 9150 ) { 
     VolTk = 721323 + (alt1 - 8750) * 81.78
    ;} else 
        if ( alt1 <= 9550 ) { 
     VolTk = 754035 + (alt1 - 9150) * 81.785
    ;} else 
        if ( alt1 <= 9950 ) { 
     VolTk = 786749 + (alt1 - 9550) * 81.7875
    ;} else 
        if ( alt1 <= 10350 ) { 
     VolTk = 819464 + (alt1 - 9950) * 81.785
     ;} else 
        if ( alt1 <= 10750 ) { 
     VolTk = 852178 + (alt1 - 10350) * 81.7925
     ;} else 
        if ( alt1 <= 11150 ) { 
     VolTk = 884895 + (alt1 - 10750) * 81.795
     ;} else 
        if ( alt1 <= 11528 ) { 
     VolTk = 917613 + (alt1 - 11150) * 81.7962962962;
    }
    }
    if ( Tk == 7 ) { 
    
		alt1 = (49745 - Altura);
    
    
      if ( alt1 <= 30 ) { 
     VolTk = 52663 + (alt1 - 0) * 369.23333333
    ;} else 
        if ( alt1 <= 90 ) { 
     VolTk = 63740 + (alt1 - 30) * 369.216666666
    ;} else 
        if ( alt1 <= 220 ) { 
     VolTk = 85893 + (alt1 - 90) * 369.2230769
    ;} else 
        if ( alt1 <= 230 ) { 
     VolTk = 133892 + (alt1 - 220) * 368.4
    ;} else 
        if ( alt1 <= 240 ) { 
     VolTk = 137576 + (alt1 - 230) * 368.5
    ;} else 
        if ( alt1 <= 290 ) { 
     VolTk = 141261 + (alt1 - 240) * 368.42
    ;} else 
        if ( alt1 <= 320 ) { 
     VolTk = 159682 + (alt1 - 290) * 368.266666666
    ;} else 
        if ( alt1 <= 340 ) { 
     VolTk = 170730 + (alt1 - 320) * 369.15
    ;} else 
        if ( alt1 <= 410 ) { 
     VolTk = 178113 + (alt1 - 340) * 369.2571429
    ;} else 
        if ( alt1 <= 500 ) { 
     VolTk = 203961 + (alt1 - 410) * 369.344444444
    ;} else 
        if ( alt1 <= 768 ) { 
     VolTk = 237202 + (alt1 - 500) * 369.4365672
    ;} else 
        if ( alt1 <= 1035 ) { 
     VolTk = 336211 + (alt1 - 768) * 369.4494382
    ;} else 
        if ( alt1 <= 1265 ) { 
     VolTk = 434854 + (alt1 - 1035) * 369.3956522
    ;} else 
        if ( alt1 <= 1315 ) { 
     VolTk = 519815 + (alt1 - 1265) * 369.32
    ;} else 
        if ( alt1 <= 1555 ) { 
     VolTk = 538281 + (alt1 - 1315) * 356.779166666
    ;} else 
        if ( alt1 <= 1817 ) { 
     VolTk = 623908 + (alt1 - 1555) * 369.3320611
    ;} else 
        if ( alt1 <= 2047 ) { 
     VolTk = 720673 + (alt1 - 1817) * 369.2173913
    ;} else 
        if ( alt1 <= 2276 ) { 
     VolTk = 805593 + (alt1 - 2047) * 369.22707424
    ;} else 
        if ( alt1 <= 2505 ) { 
     VolTk = 890146 + (alt1 - 2276) * 369.2401747
    ;} else 
        if ( alt1 <= 2734 ) { 
     VolTk = 974702 + (alt1 - 2505) * 369.2489083
    ;} else 
        if ( alt1 <= 2963 ) { 
     VolTk = 1059260 + (alt1 - 2734) * 369.262009
    ;} else 
        if ( alt1 <= 3192 ) { 
     VolTk = 1143821 + (alt1 - 2963) * 369.275109
    ;} else 
        if ( alt1 <= 3421 ) { 
     VolTk = 1228385 + (alt1 - 3192) * 369.2838428
    ;} else 
        if ( alt1 <= 3650 ) { 
     VolTk = 1312951 + (alt1 - 3421) * 369.296943231
    ;} else 
        if ( alt1 <= 3880 ) { 
     VolTk = 1397520 + (alt1 - 3650) * 369.56956522
    ;} else 
        if ( alt1 <= 4109 ) { 
     VolTk = 1482521 + (alt1 - 3880) * 369.58515284
    ;} else 
        if ( alt1 <= 4339 ) { 
     VolTk = 1567156 + (alt1 - 4109) * 369.60434783
    ;} else 
        if ( alt1 <= 4568 ) { 
     VolTk = 1652165 + (alt1 - 4339) * 369.62008734
    ;} else 
        if ( alt1 <= 4798 ) { 
     VolTk = 1736808 + (alt1 - 4568) * 369.63478261
    ;} else 
        if ( alt1 <= 5027 ) { 
     VolTk = 1821824 + (alt1 - 4798) * 369.65065502
    ;} else 
        if ( alt1 <= 5256 ) { 
     VolTk = 1906474 + (alt1 - 5027) * 369.6681223
    ;} else 
        if ( alt1 <= 5485 ) { 
     VolTk = 1991128 + (alt1 - 5256) * 369.68558952
    ;} else 
        if ( alt1 <= 5669 ) { 
     VolTk = 2075786 + (alt1 - 5485) * 369.5326087
    ;} else 
        if ( alt1 <= 5852 ) { 
     VolTk = 2143780 + (alt1 - 5669) * 369.54644809
    ;} else 
        if ( alt1 <= 6036 ) { 
     VolTk = 2211407 + (alt1 - 5852) * 369.56521739
    ;} else 
        if ( alt1 <= 6219 ) { 
     VolTk = 2279407 + (alt1 - 6036) * 369.57923497
    ;} else 
        if ( alt1 <= 6403 ) { 
     VolTk = 2347040 + (alt1 - 6219) * 369.59782609
    ;} else 
        if ( alt1 <= 6586 ) { 
     VolTk = 2415046 + (alt1 - 6403) * 369.61748634
    ;} else 
        if ( alt1 <= 6770 ) { 
     VolTk = 2482686 + (alt1 - 6586) * 369.63043478
    ;} else 
        if ( alt1 <= 6953 ) { 
     VolTk = 2550698 + (alt1 - 6770) * 369.64480874
    ;} else 
        if ( alt1 <= 7137 ) { 
     VolTk = 2618343 + (alt1 - 6953) * 369.6684783
    ;} else 
        if ( alt1 <= 7321 ) { 
     VolTk = 2686362 + (alt1 - 7137) * 369.67934783
    ;} else 
        if ( alt1 <= 7505 ) { 
     VolTk = 2754383 + (alt1 - 7321) * 369.70108696
    ;} else 
        if ( alt1 <= 7689 ) { 
     VolTk = 2822408 + (alt1 - 7505) * 369.71195652
    ;} else 
        if ( alt1 <= 7873 ) { 
     VolTk = 2890435 + (alt1 - 7689) * 369.73369565
    ;} else 
        if ( alt1 <= 8057 ) { 
     VolTk = 2958466 + (alt1 - 7873) * 369.75
    ;} else 
        if ( alt1 <= 8241 ) { 
     VolTk = 3026500 + (alt1 - 8057) * 369.76630435
    ;} else 
        if ( alt1 <= 8425 ) { 
     VolTk = 3094537 + (alt1 - 8241) * 369.77717391
    ;} else 
        if ( alt1 <= 8610 ) { 
     VolTk = 3162576 + (alt1 - 8425) * 369.74594595
    ;} else 
        if ( alt1 <= 8794 ) { 
     VolTk = 3230979 + (alt1 - 8610) * 369.76630435
    ;} else 
        if ( alt1 <= 8978 ) { 
     VolTk = 3299016 + (alt1 - 8794) * 369.76086957
    ;} else 
        if ( alt1 <= 9162 ) { 
     VolTk = 3367052 + (alt1 - 8978) * 369.75543478
    ;} else 
        if ( alt1 <= 9347 ) { 
     VolTk = 3435087 + (alt1 - 9162) * 369.75675676
    ;} else 
        if ( alt1 <= 9439 ) { 
     VolTk = 3503492 + (alt1 - 9347) * 369.75
    ;} else 
        if ( alt1 <= 9531 ) { 
     VolTk = 3537509 + (alt1 - 9439) * 369.76086957
    ;} else 
        if ( alt1 <= 9899 ) { 
     VolTk = 3571527 + (alt1 - 9531) * 369.755434782
    ;} else 
        if ( alt1 <= 10266 ) { 
     VolTk = 3707597 + (alt1 - 9899) * 369.683923705
    ;} else 
        if ( alt1 <= 10632 ) { 
     VolTk = 3843271 + (alt1 - 10266) * 369.680327868
    ;} else 
        if ( alt1 <= 10998 ) { 
     VolTk = 3978574 + (alt1 - 10632) * 369.68306011
    ;} else 
        if ( alt1 <= 11364 ) { 
     VolTk = 4113878 + (alt1 - 10998) * 369.68306011
    ;} else 
        if ( alt1 <= 11736 ) { 
     VolTk = 4249182 + (alt1 - 11364) * 369.83602151
    ;} else 
        if ( alt1 <= 12107 ) { 
     VolTk = 4386761 + (alt1 - 11736) * 369.832884097
    ;} else 
        if ( alt1 <= 12307 ) { 
     VolTk = 4523969 + (alt1 - 12107) * 369.835
    ;} else 
        if ( alt1 <= 12337 ) { 
     VolTk = 4597936 + (alt1 - 12307) * 369.8666666666
    ;} else 
        if ( alt1 <= 12437 ) { 
     VolTk = 4609032 + (alt1 - 12337) * 370.14
    ;} else 
        if ( alt1 <= 12849 ) { 
     VolTk = 4646046 + (alt1 - 12437) * 370.140776699;
     }
     }
    if ( Tk == 8 ){ 
        alt1 =( 123160 - Altura );
    }
    if ( Tk == 11 ){ 
        alt1 = ( 154540 - Altura );
    }
    
    if ( Tk == 12 ){ 
        alt1 = ( 115361 - Altura );
    }
    if ( Tk == 18 ){ 
        alt1 = ( 54621 - Altura );
    }
    if ( Tk == 20 ){ 
        alt1 = ( 30654 - Altura );
    }
      
   }
 return VolTk;       
}
}

    
    
