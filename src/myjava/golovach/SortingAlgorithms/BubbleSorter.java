package golovach.SortingAlgorithms;

/**
 * Created by AlexanderFjodorov on 08.11.2015.
 * Р­С‚РѕС‚ РєР»Р°СЃСЃ-СЃРѕСЂС‚РёСЂРѕРІС‰РёРє СЂРµР°Р»РёР·СѓРµС‚ РјРµС‚РѕРґС‹ СЃРѕСЂС‚РёСЂРѕРІРєРё РґР°РЅРЅС‹С… "РџСѓР·С‹СЂСЊРєРѕРј":
 * - РњРµС‚РѕРґ sortArray СЃРѕСЂС‚РёСЂСѓРµС‚ РґР°РЅРЅС‹Рµ РІ РјР°СЃСЃРёРІРµ,
 * - РњРµС‚РѕРґ sortFile СЃРѕСЂС‚РёСЂСѓРµС‚ РґР°РЅРЅС‹Рµ, РЅР°С…РѕРґСЏС‰РёРµСЃСЏ РІ С„Р°Р№Р»Рµ
 *
 * РђР»РіРѕСЂРёС‚Рј РёРјРµРµС‚ СЃР»РѕР¶РЅРѕСЃС‚СЊ O(n*n). РћРЅ РјР°Р»РѕСЌС„С„РµРєС‚РёРІРµРЅ, РЅРѕ РѕС‡РµРЅСЊ РїСЂРѕСЃС‚ Рё РїРѕРЅСЏС‚РµРЅ. Рђ С‚Р°Рє Р¶Рµ РµРіРѕ РјРѕР¶РµРѕ СѓР»СѓС‡С€Р°С‚СЊ.
 *
 * РЈР»СѓС‡С€РµРЅРёРµ в„–1.
 * Р Р°СЃСЃРјРѕС‚СЂРёРј СЃРёС‚СѓР°С†РёСЋ, РєРѕРіРґР° РЅР° РєР°РєРѕРј-Р»РёР±Рѕ РёР· РїСЂРѕС…РѕРґРѕРІ РЅРµ РїСЂРѕРёР·РѕС€Р»Рѕ РЅРё РѕРґРЅРѕРіРѕ РѕР±РјРµРЅР°.
 * Р­С‚Рѕ Р·РЅР°С‡РёС‚, С‡С‚Рѕ РІСЃРµ РїР°СЂС‹ СЂР°СЃРїРѕР»РѕР¶РµРЅС‹ РІ РїСЂР°РІРёР»СЊРЅРѕРј РїРѕСЂСЏРґРєРµ, РјР°СЃСЃРёРІ СѓР¶Рµ РѕС‚СЃРѕСЂС‚РёСЂРѕРІР°РЅ Рё РїСЂРѕРґРѕР»Р¶Р°С‚СЊ РїСЂРѕС†РµСЃСЃ РЅРµ РёРјРµРµС‚ СЃРјС‹СЃР»Р°.
 * Р�С‚Р°Рє, РїРµСЂРІРѕРµ СѓР»СѓС‡С€РµРЅРёРµ Р·Р°РєР»СЋС‡Р°РµС‚СЃСЏ РІ Р·Р°РїРѕРјРёРЅР°РЅРёРё, РїСЂРѕРёР·РІРѕРґРёР»СЃСЏ Р»Рё РЅР° РґР°РЅРЅРѕРј РїСЂРѕС…РѕРґРµ РєР°РєРѕР№-Р»РёР±Рѕ РѕР±РјРµРЅ.
 * Р•СЃР»Рё РЅРµС‚ - Р°Р»РіРѕСЂРёС‚Рј Р·Р°РєР°РЅС‡РёРІР°РµС‚ СЂР°Р±РѕС‚Сѓ.
 *
 * РЈР»СѓС‡С€РµРЅРёРµ в„–2.
 * РњР°СЃСЃРёРІ [1 2 3 4 0] Р±СѓРґРµС‚ РѕС‚СЃРѕСЂС‚РёСЂРѕРІР°РЅ РїСЂРѕС…РѕРґР°РјРё РЅР°РїСЂР°РІРѕ (СЃРґРІРёРіР°СЏ РЅР°РёР±РѕР»СЊС€РёР№ СЌР»РµРјРµРЅС‚) Р·Р° 4 С€Р°РіР°.
 * РћРґРЅР°РєРѕ, РµСЃР»Рё Р±С‹ РµРіРѕ СЃРѕСЂС‚РёСЂРѕРІР°Р»Рё РїСЂРѕС…РѕРґР°РјРё РЅР°Р»РµРІРѕ (СЃРґРІРёРіР°СЏ РЅР°РёРјРµРЅСЊС€РёР№ СЌР»РµРјРµРЅС‚), С‚Рѕ РїРѕС‚СЂРµР±РѕРІР°Р»СЃСЏ Р±С‹ РІСЃРµРіРѕ 1 РїСЂРѕС…РѕРґ
 * Р”Р»СЏ СЌС„С„РµРєС‚РёРІРЅРѕР№ РѕР±СЂР°Р±РѕС‚РєРё С‚Р°РєРёС… СЃРёС‚СѓР°С†РёР№ РјРѕР¶РЅРѕ С‡РµСЂРµРґРѕРІР°С‚СЊ РїСЂРѕС…РѕРґС‹ РЅР°РїСЂР°РІРѕ Рё РЅР°Р»РµРІРѕ
 * Р­С‚РѕС‚ РјРµС‚РѕРґ РЅР°Р·С‹РІР°РµС‚СЃСЏ С€РµР№РєРµСЂ-СЃРѕСЂС‚РёСЂРѕРІРєРѕР№
 *
 */
public class BubbleSorter extends Sorter{

    boolean shake = true;//Р’Р°СЂРёР°РЅС‚ СЃРѕСЂС‚РёСЂРѕРІРєРё С€РµР№РєРµСЂ - РїСѓР·С‹СЂСЊРєРѕРј
    boolean printStep = false;//РџРµС‡Р°С‚Р°С‚СЊ РјР°СЃСЃРёРІ РїРѕСЃР»Рµ РєР°Р¶РґРѕР№ РёС‚РµСЂР°С†РёРё

    int changeNum = 0;//РЎС‡РµС‚С‡РёРє (РёРЅС„РѕСЂРјР°С†РёРѕРЅРЅРѕ), СЃРєРѕР»СЊРєРѕ РѕР±РјРµРЅРѕРІ СЃРґРµР»Р°РЅРѕ
    int cycleNum = 0;//РЎС‡РµС‚С‡РёРє (РёРЅС„РѕСЂРјР°С†РёРѕРЅРЅРѕ), СЃРєРѕР»СЊРєРѕ РїСЂРѕС…РѕРґРѕРІ РїРѕ РјР°СЃСЃРёРІСѓ СЃРґРµР»Р°РЅРѕ
    boolean stop;//Р•СЃР»Рё РЅР° РїРѕСЃР»РµРґРЅРµРј С€Р°РіРµ Р·Р°РјРµРЅ РЅРµ Р±С‹Р»Рѕ, С‚Рѕ РїСЂРѕС†РµСЃСЃ РјРѕР¶РЅРѕ РЅРµ РїСЂРѕРґРѕР»Р¶Р°С‚СЊ, С‚.Рє. РјР°СЃСЃРёРІ СѓР¶Рµ РѕС‚СЃРѕСЂС‚РёСЂРѕРІР°РЅ

    private void swap(int[] arr, int i, int j){//РћР±РјРµРЅ РґРІСѓС… СЌР»РµРјРµРЅС‚РѕРІ РјР°СЃСЃРёРІР°
        int var = arr[i];
        arr[i] = arr[j];
        arr[j] = var;
        changeNum++;
    }

    public void printArray(int[] arr){
        System.out.print("[ ");
        for (int elem : arr){
            System.out.print(elem + " ");
        }
        System.out.println("]");
    }

    public void sortArray(int[] arr){

        if(shake){
            shakeSortArray(arr);//Р•СЃР»Рё РІС‹Р±СЂР°РЅ СЂРµР¶РёРј С€РµР№РєРµСЂ-СЃРѕСЂС‚РёСЂРѕРІРєРё, С‚Рѕ Р·Р°РїСѓСЃРєР°РµРј СЌС‚РѕС‚ Р°Р»РіРѕСЂРёС‚Рј, РёРЅРµС‡Рµ СЃРѕСЂС‚РёСЂСѓРµРј РѕР±С‹С‡РЅС‹Рј РїСѓР·С‹СЂСЊРєРѕРј
        }else {
            for (int barier = arr.length - 1; barier >= 1; barier--) {
                stop = true;//РќР° РєР°Р¶РґРѕРј РєСЂСѓРіРµ РїСЂРµРґРїРѕР»Р°РіР°РµРј, С‡С‚Рѕ РѕРЅ Р±СѓРґРµС‚ РїРѕСЃР»РµРґРЅРёРј Рё С‡С‚Рѕ РїРѕСЃР»Рµ РЅРµРіРѕ РјР°СЃСЃРёРІ Р±СѓРґРµС‚ РѕС‚СЃРѕСЂС‚РёСЂРѕРІР°РЅ
                cycleNum++;
                for (int i = 0; i < barier; i++) {
                    if (arr[i] > arr[i + 1]) {
                        swap(arr, i, i + 1);
                        stop = false;//Р•СЃР»Рё С…РѕС‚СЊ РѕРґРЅР° Р·Р°РјРµРЅР° РїСЂРѕРёР·РѕС€Р»Р°, С‚Рѕ РЅСѓР¶РµРЅРѕ Р±СѓРґРµС‚ СЃРґРµР»Р°С‚СЊ РµС‰Рµ РјРёРЅРёРјСѓРј РѕРґРёРЅ РєСЂСѓРі
                    }
                }
                if (stop) break;//Р•СЃР»Рё РїСЂРѕРґРѕР»Р¶Р°С‚СЊ РЅРµ РЅСѓР¶РЅРѕ - РІС‹С…РѕРґРёРј РёР· С†РёРєР»Р°
                if (printStep) printArray(arr);
            }
            System.out.println("РЎРѕСЂС‚РёСЂРѕРІРєР° РїСѓР·С‹СЂСЊРєРѕРј. РџРѕС‚СЂРµР±РѕРІР°Р»РѕСЃСЊ: " + changeNum + " РѕР±РјРµРЅРѕРІ, Рё " + cycleNum + " РїСЂРѕС…РѕРґРѕРІ");
        }
    }

    public void shakeSortArray(int[] arr){

        int barierLeft = 0;
        int barierRight = arr.length - 1;

        while (barierLeft < barierRight){
            stop = true;//РќР° РєР°Р¶РґРѕРј РєСЂСѓРіРµ РїСЂРµРґРїРѕР»Р°РіР°РµРј, С‡С‚Рѕ РѕРЅ Р±СѓРґРµС‚ РїРѕСЃР»РµРґРЅРёРј Рё С‡С‚Рѕ РїРѕСЃР»Рµ РЅРµРіРѕ РјР°СЃСЃРёРІ Р±СѓРґРµС‚ РѕС‚СЃРѕСЂС‚РёСЂРѕРІР°РЅ

            //РџСЂРѕР±РµРіР°РµРј РІРїСЂР°РІРѕ
            for (int i = barierLeft; i < barierRight; i++){
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i + 1);
                    stop = false;//Р•СЃР»Рё С…РѕС‚СЊ РѕРґРЅР° Р·Р°РјРµРЅР° РїСЂРѕРёР·РѕС€Р»Р°, С‚Рѕ РЅСѓР¶РµРЅРѕ Р±СѓРґРµС‚ СЃРґРµР»Р°С‚СЊ РµС‰Рµ РјРёРЅРёРјСѓРј РѕРґРёРЅ РєСЂСѓРі
                }
            }
            if (printStep) printArray(arr);
            cycleNum++;
            barierRight--;

            if (stop) break;//Р•СЃР»Рё РїСЂРѕРґРѕР»Р¶Р°С‚СЊ РЅРµ РЅСѓР¶РЅРѕ - РІС‹С…РѕРґРёРј РёР· С†РёРєР»Р°
            if (barierLeft == barierRight) break;//Р‘Р°СЂСЊРµСЂС‹ СЃРѕРІРїР°Р»Рё, Р·РЅР°С‡РёС‚ РІРµСЃСЊ РјР°СЃСЃРёРІ РѕСЃС‚РѕСЂС‚РёСЂРѕРІР°РЅ, РІС‹С…РѕРґРј РёР· С†РёРєР»Р°

            //РџСЂРѕР±РµРіР°РµРј РІР»РµРІРѕ
            for (int i = barierRight; i > barierLeft; i--){
                if (arr[i] < arr[i-1]) {
                    swap(arr, i, i - 1);
                    stop = false;//Р•СЃР»Рё С…РѕС‚СЊ РѕРґРЅР° Р·Р°РјРµРЅР° РїСЂРѕРёР·РѕС€Р»Р°, С‚Рѕ РЅСѓР¶РµРЅРѕ Р±СѓРґРµС‚ СЃРґРµР»Р°С‚СЊ РµС‰Рµ РјРёРЅРёРјСѓРј РѕРґРёРЅ РєСЂСѓРі
                }
            }
            if (printStep) printArray(arr);
            cycleNum++;
            barierLeft++;
        }

        System.out.println("РЁРµР№РєРµСЂ-РЎРѕСЂС‚РёСЂРѕРІРєР° РїСѓР·С‹СЂСЊРєРѕРј. РџРѕС‚СЂРµР±РѕРІР°Р»РѕСЃСЊ: " + changeNum + " РѕР±РјРµРЅРѕРІ, Рё " + cycleNum + " РїСЂРѕС…РѕРґРѕРІ");
    }

}
