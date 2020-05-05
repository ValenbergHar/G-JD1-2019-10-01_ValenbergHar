package golovach.DynamicDataStructure;

/**
 * Created by AdminAccount on 24.11.2015.
 */
public class DoubleLinkedListMethods {
    public static void main(String[] args) {
        DNode tail = new DNode(3, null, null);
        generateRec(tail); printFromHead(tail);
        addIter(tail, -1); printFromHead(tail);
        addRec(tail, -2); printFromHead(tail);
        addIter(tail, 6, 10); printFromHead(tail);
        addRec(tail, 7, 20); printFromHead(tail);
        removeIter(tail); printFromHead(tail);
        removeRec(tail); printFromHead(tail);
        removeIter(tail, 5); printFromHead(tail);
        removeRec(tail, 1); printFromHead(tail);
    }

    public static void print(DNode tail){
        printFromTail(tail);
        printFromHead(tail);
    }

    public static void printFromTail(DNode tail){
        System.out.println(toStringFromTail(tail));
    }
    public static String toStringFromTail(DNode ref){
        String result = "";
        while (ref != null){
            result += "(" + ref.value + ")->";
            ref = ref.next;
        }
        return result + "null";
    }
    public static void printFromHead(DNode tail){
        System.out.println(toStringFromHead(tail));
    }
    public static String toStringFromHead(DNode ref){
        while (ref.next != null){
            ref = ref.next;
        }
        String result = "";
        while (ref != null){
            result += "<-(" + ref.value + ")";
            ref = ref.prev;
        }
        return "null" + result;
    }

    public static void generateRec(DNode node){//Р РµРєСѓСЂСЃРёРІРЅР°СЏ РіРµРЅРµСЂР°С†РёСЏ СЃРїРёСЃРєР° СЃ "С…РІРѕСЃС‚Р°"
        if(node.value > 0){
            node.next = new DNode(node.value - 1, node, null);
            generateRec(node.next);
        }
    }

    //Р�С‚РµСЂР°С‚РёРІРЅС‹Р№ РїРѕРґСЃС‡РµС‚ РєРѕР»РёС‡РµСЃС‚РІР° СЌР»РµРјРµРЅС‚РѕРІ РїРµСЂРµРґР°РЅРЅРѕРіРѕ СЃРїРёСЃРєР°
    public static int sizeIter(DNode node){
        int size = 0;
        while (node != null){
            size++;
            node = node.next;
        }
        return size;
    }



    //РњРµС‚РѕРґС‹ СЂР°Р±РѕС‚С‹ СЃРѕ СЃРїРёСЃРєРѕРј

    //Р�С‚РµСЂР°С‚РёРІРЅРѕРµ РґРѕР±Р°РІР»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РІ РєРѕРЅРµС† СЃРїРёСЃРєР° (РІ РіРѕР»РѕРІСѓ)
    public static void addIter(DNode node, int value){
        while (node.next != null){
            node = node.next;
        }
        node.next = new DNode(value, node, null);
    }

    //Р РµРєСѓСЂСЃРёРІРЅРѕРµ РґРѕР±Р°РІР»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РІ РєРѕРЅРµС† СЃРїРёСЃРєР° (РІ РіРѕР»РѕРІСѓ)
    public static void addRec(DNode node, int value){
        if (node.next == null) node.next = new DNode(value, node, null);
        else addRec(node.next, value);
    }

    //Р�С‚РµСЂР°С‚РёРІРЅРѕРµ РґРѕР±Р°РІР»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РЅР° i-СѓСЋ РїРѕР·РёС†РёСЋ
    public static void addIter(DNode node, int index, int value){
        if (index == 0) {
            System.out.println("addIter(node, index, value): РІСЃС‚Р°РІРєР° РІ 0 РїРѕР·РёС†РёСЋ РЅРµРІРѕР·РјРѕР¶РЅР°");
        }else if(index > sizeIter(node)){
            System.out.println("addIter(node, index, value): РІСЃС‚Р°РІРєР° РЅРµРІРѕР·РјРѕР¶РЅР°, С‚.Рє. РёРЅРґРµРєСЃ Р±РѕР»СЊС€Рµ РґР»РёРЅС‹ СЃРїРёСЃРєР°");
        }else {
            int k = 1;
            while (k < index){
                node = node.next;
                k++;
            }
            node.next = new DNode(value, node, node.next);
            if(node.next.next != null) node.next.next.prev = node.next;
        }
    }

    //Р РµРєСѓСЂСЃРёРІРЅРѕРµ РґРѕР±Р°РІР»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РЅР° i-СѓСЋ РїРѕР·РёС†РёСЋ
    public static void addRec(DNode node, int index, int value){
        if (index == 0) {
            System.out.println("addRec(node, index, value): РІСЃС‚Р°РІРєР° РІ 0 РїРѕР·РёС†РёСЋ РЅРµРІРѕР·РјРѕР¶РЅР°");
        }else if(index > sizeIter(node)){
            System.out.println("addRec(node, index, value): РІСЃС‚Р°РІРєР° РЅРµРІРѕР·РјРѕР¶РЅР°, С‚.Рє. РёРЅРґРµРєСЃ Р±РѕР»СЊС€Рµ РґР»РёРЅС‹ СЃРїРёСЃРєР°");
        }else if(index == 1){
            node.next = new DNode(value, node, node.next);
            if(node.next.next != null) node.next.next.prev = node.next;
        } else addRec(node.next, index - 1, value);

    }

    //Р�С‚РµСЂР°С‚РёРІРЅРѕРµ СѓРґР°Р»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РёР· РєРѕРЅС†Р° СЃРїРёСЃРєР° (РёР· РіРѕР»РѕРІС‹)
    public static void removeIter(DNode node){
        if (node.next == null || node == null) return;
        while (node.next.next != null){
            node = node.next;
        }
        node.next = null;
    }

    //Р РµРєСѓСЂСЃРёРІРЅРѕРµ СѓРґР°Р»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РёР· РєРѕРЅС†Р° СЃРїРёСЃРєР° (РёР· РіРѕР»РѕРІС‹)
    public static void removeRec(DNode node){
        if (node.next == null || node == null) return;
        if (node.next.next == null) {
            node.next = null;
        }else {
            removeRec(node.next);
        }
    }

    //Р�С‚РµСЂР°С‚РёРІРЅРѕРµ СѓРґР°Р»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РёР· i-РѕР№ РїРѕР·РёС†РёРё
    public static void removeIter(DNode node, int index){
        if (index == 0) {
            System.out.println("removeIter(node, index): СѓРґР°Р»РµРЅРёРµ РёР· 0 РїРѕР·РёС†РёРё РЅРµРІРѕР·РјРѕР¶РЅРѕ");
        }else if(index >= sizeIter(node)){
            System.out.println("removeIter(node, index): СѓРґР°Р»РµРЅРёРµ РЅРµРІРѕР·РјРѕР¶РЅРѕ, С‚.Рє. РёРЅРґРµРєСЃ Р±РѕР»СЊС€Рµ РґР»РёРЅС‹ СЃРїРёСЃРєР°");
        }else {
            int k = 1;
            while (k < index){
                node = node.next;
                k++;
            }
            if (node.next.next != null) node.next.next.prev = node;
            node.next = node.next.next;
        }
    }

    //Р РµРєСѓСЂСЃРёРІРЅРѕРµ СѓРґР°Р»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РёР· i-РѕР№ РїРѕР·РёС†РёРё
    public static void removeRec(DNode node, int index){
        if (index == 0) {
            System.out.println("removeRec(node, index): СѓРґР°Р»РµРЅРёРµ РёР· 0 РїРѕР·РёС†РёРё РЅРµРІРѕР·РјРѕР¶РЅРѕ");
        }else if(index >= sizeIter(node)){
            System.out.println("removeRec(node, index): СѓРґР°Р»РµРЅРёРµ РЅРµРІРѕР·РјРѕР¶РЅРѕ, С‚.Рє. РёРЅРґРµРєСЃ Р±РѕР»СЊС€Рµ РґР»РёРЅС‹ СЃРїРёСЃРєР°");
        }else if(index == 1){
            if (node.next.next != null) node.next.next.prev = node;
            node.next = node.next.next;
        } else removeRec(node.next, index - 1);

    }

}
