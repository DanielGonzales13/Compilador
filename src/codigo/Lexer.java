/* The following code was generated by JFlex 1.6.1 */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>G:/proyectocomppiladores/Analizador_Fase1_Compil/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\50\1\53\1\53\1\52\22\0\1\5\1\44\1\66"+
    "\1\4\2\0\1\36\1\67\1\56\1\57\1\54\1\41\1\5\1\42"+
    "\1\3\1\51\4\2\1\65\5\2\1\0\1\55\1\45\1\43\1\45"+
    "\1\4\1\0\2\1\1\12\5\1\1\10\4\1\1\11\1\13\1\6"+
    "\1\1\1\7\6\1\1\37\1\1\1\62\1\0\1\63\1\0\1\24"+
    "\1\0\1\23\1\46\1\16\1\34\1\27\1\25\1\64\1\32\1\15"+
    "\2\1\1\35\1\30\1\20\1\17\1\31\1\70\1\22\1\14\1\21"+
    "\1\26\1\33\2\1\1\47\1\1\1\60\1\40\1\61\7\0\1\53"+
    "\u1fa2\0\1\53\1\53\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\1\1\3\2\1\1\4\20\1"+
    "\1\5\1\6\1\7\1\1\1\10\1\1\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\1\1\23\1\1\1\0\2\1\1\24\25\1\1\4"+
    "\1\0\1\25\1\26\1\10\2\1\1\27\1\0\1\1"+
    "\1\0\1\30\1\0\1\31\23\1\1\32\5\1\1\0"+
    "\2\1\1\0\1\1\1\0\1\33\10\1\1\34\10\1"+
    "\1\35\1\36\4\1\1\0\1\1\1\37\1\0\1\2"+
    "\11\1\1\0\1\1\1\40\1\1\1\41\6\1\1\42"+
    "\1\0\1\1\2\0\1\1\1\3\4\1\1\43\1\0"+
    "\4\1\1\44\1\1\1\0\2\1\1\23\1\1\1\31"+
    "\1\45\5\1\1\0\1\1\1\46\3\1\1\0\1\1"+
    "\1\47\1\50\1\45\2\1\1\51\1\1\1\52\1\0"+
    "\1\53\1\1\1\54\1\0\1\55\1\56\1\32\1\57"+
    "\5\0\1\60\2\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[227];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\71\0\162\0\253\0\344\0\u011d\0\u0156\0\u018f"+
    "\0\162\0\u01c8\0\u0201\0\u023a\0\u0273\0\u02ac\0\u02e5\0\u031e"+
    "\0\u0357\0\u0390\0\u03c9\0\u0402\0\u043b\0\u0474\0\u04ad\0\u04e6"+
    "\0\u051f\0\u0558\0\u0591\0\u05ca\0\u05ca\0\u05ca\0\u0603\0\u063c"+
    "\0\u0675\0\71\0\71\0\u06ae\0\71\0\71\0\71\0\71"+
    "\0\71\0\u06e7\0\u0720\0\u0759\0\u0792\0\u07cb\0\u0804\0\162"+
    "\0\u083d\0\u0876\0\u08af\0\u08e8\0\u0921\0\u095a\0\u0993\0\u09cc"+
    "\0\u0a05\0\u0a3e\0\u0a77\0\u0ab0\0\u0ae9\0\u0b22\0\u0b5b\0\u0b94"+
    "\0\u0bcd\0\u0c06\0\u0c3f\0\u0c78\0\u0cb1\0\71\0\u0cea\0\71"+
    "\0\71\0\71\0\u0d23\0\u0d5c\0\u0d95\0\u0dce\0\u0e07\0\u0720"+
    "\0\u0720\0\u0e40\0\u0792\0\u0e79\0\u0eb2\0\u0eeb\0\u0f24\0\u0f5d"+
    "\0\u0f96\0\u0fcf\0\u1008\0\u1041\0\u107a\0\u10b3\0\u10ec\0\u1125"+
    "\0\u115e\0\u1197\0\u11d0\0\u1209\0\u1242\0\u127b\0\162\0\u12b4"+
    "\0\u12ed\0\u1326\0\u135f\0\u1398\0\u13d1\0\u140a\0\u1443\0\u147c"+
    "\0\u14b5\0\u14ee\0\u14ee\0\u1527\0\u1560\0\u1599\0\u15d2\0\u160b"+
    "\0\u1644\0\u167d\0\u16b6\0\162\0\u16ef\0\u1728\0\u1761\0\u179a"+
    "\0\u17d3\0\u180c\0\u1845\0\u187e\0\162\0\162\0\u18b7\0\u18f0"+
    "\0\u1929\0\u1962\0\u199b\0\u19d4\0\162\0\u1a0d\0\71\0\u1a46"+
    "\0\u14ee\0\u1a7f\0\u1ab8\0\u1af1\0\u1b2a\0\u1b63\0\u1b9c\0\u1bd5"+
    "\0\u1c0e\0\u1c47\0\162\0\u1c80\0\u1cb9\0\u1cf2\0\u1d2b\0\u1d64"+
    "\0\u1d9d\0\u1dd6\0\u1e0f\0\162\0\u1e48\0\u1e81\0\u1eba\0\u1ef3"+
    "\0\u1f2c\0\162\0\u1f65\0\u1f9e\0\u1fd7\0\u2010\0\162\0\u2049"+
    "\0\u2082\0\u20bb\0\u20f4\0\u212d\0\162\0\u2166\0\u219f\0\u21d8"+
    "\0\u2211\0\71\0\u224a\0\71\0\u2283\0\u22bc\0\u22f5\0\u232e"+
    "\0\u2367\0\u23a0\0\u23d9\0\u2412\0\162\0\u244b\0\u2484\0\u24bd"+
    "\0\u24f6\0\u252f\0\162\0\162\0\u1ef3\0\u2568\0\u25a1\0\162"+
    "\0\u25da\0\162\0\u2613\0\162\0\u264c\0\162\0\u2685\0\162"+
    "\0\u26be\0\71\0\162\0\u26f7\0\u2730\0\u2769\0\u27a2\0\u27db"+
    "\0\71\0\u2814\0\u284d";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[227];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\2\5\1\6\1\7\1\3\1\10"+
    "\2\3\1\11\1\12\1\13\1\14\1\15\1\16\1\3"+
    "\1\17\1\3\1\2\1\20\1\3\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\11\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\3\1\40\1\41"+
    "\1\6\1\0\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\4\1\53\1\54\1\3\72\0"+
    "\1\3\3\5\1\0\16\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\2\0"+
    "\1\4\1\55\61\0\1\4\4\0\1\3\1\0\2\5"+
    "\1\0\16\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\3\0\1\3\5\0\1\6\44\0\1\6"+
    "\17\0\1\3\3\5\1\0\1\3\1\56\14\3\1\0"+
    "\11\3\1\0\1\3\6\0\2\3\14\0\1\3\1\5"+
    "\2\0\1\3\1\0\1\3\3\5\1\0\3\3\1\57"+
    "\12\3\1\0\11\3\1\0\1\3\6\0\2\3\14\0"+
    "\1\3\1\5\2\0\1\3\1\0\1\3\3\5\1\0"+
    "\7\3\1\60\6\3\1\0\11\3\1\0\1\3\6\0"+
    "\2\3\14\0\1\3\1\5\2\0\1\3\1\0\1\3"+
    "\3\5\1\0\12\3\1\61\3\3\1\0\3\3\1\62"+
    "\5\3\1\0\1\3\6\0\2\3\14\0\1\3\1\5"+
    "\2\0\1\3\1\0\1\3\3\5\1\0\11\3\1\63"+
    "\3\3\1\64\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\13\3\1\65\2\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\16\3\1\0\1\3\1\66\7\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\11\3\1\67\4\3"+
    "\1\0\2\3\1\70\6\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\15\3\1\71\1\0\1\3\1\72\1\73\5\3"+
    "\1\74\1\0\1\3\6\0\2\3\14\0\1\3\1\5"+
    "\2\0\1\3\1\0\1\3\3\5\1\0\12\3\1\75"+
    "\3\3\1\0\11\3\1\0\1\3\6\0\2\3\14\0"+
    "\1\3\1\5\2\0\1\3\1\0\1\3\3\5\1\0"+
    "\7\3\1\76\5\3\1\77\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\11\3\1\100\4\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\11\3\1\101\3\3"+
    "\1\102\1\0\11\3\1\0\1\3\6\0\2\3\14\0"+
    "\1\3\1\5\2\0\1\3\1\0\1\3\3\5\1\0"+
    "\16\3\1\0\2\3\1\103\6\3\1\0\1\3\6\0"+
    "\2\3\14\0\1\3\1\5\2\0\1\3\1\0\1\3"+
    "\3\5\1\0\16\3\1\0\2\3\1\104\6\3\1\0"+
    "\1\3\6\0\2\3\14\0\1\3\1\5\2\0\1\3"+
    "\1\0\1\3\3\5\1\0\7\3\1\105\6\3\1\0"+
    "\11\3\1\0\1\3\6\0\2\3\14\0\1\3\1\5"+
    "\2\0\1\3\36\0\1\106\31\0\1\107\40\0\1\106"+
    "\71\0\1\110\71\0\1\111\71\0\1\112\26\0\1\3"+
    "\3\5\1\0\11\3\1\113\4\3\1\0\11\3\1\0"+
    "\1\3\6\0\1\3\1\114\14\0\1\3\1\5\2\0"+
    "\1\3\5\0\1\40\44\0\1\40\67\0\1\115\61\0"+
    "\1\116\27\0\1\3\3\5\1\0\14\3\1\117\1\3"+
    "\1\0\11\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\50\120\1\0\1\120\2\0\12\120"+
    "\1\121\2\120\50\122\1\0\1\122\2\0\15\122\2\0"+
    "\1\123\62\0\1\123\4\0\1\3\3\5\1\0\2\3"+
    "\1\124\13\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\2\3\1\125\13\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\13\3\1\126\2\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\16\3\1\0\4\3"+
    "\1\127\4\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\12\3"+
    "\1\130\3\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\6\3\1\131\5\3\1\132\1\3\1\0\7\3"+
    "\1\133\1\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\14\3"+
    "\1\134\1\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\16\3\1\0\10\3\1\135\1\0\1\3\6\0"+
    "\2\3\14\0\1\3\1\5\2\0\1\3\1\0\1\3"+
    "\3\5\1\0\16\3\1\0\3\3\1\136\5\3\1\0"+
    "\1\3\6\0\2\3\14\0\1\3\1\5\2\0\1\3"+
    "\1\0\1\3\3\5\1\0\13\3\1\137\2\3\1\0"+
    "\11\3\1\0\1\3\6\0\2\3\14\0\1\3\1\5"+
    "\2\0\1\3\1\0\1\3\3\5\1\0\16\3\1\0"+
    "\10\3\1\140\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\12\3"+
    "\1\141\3\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\10\3\1\142\5\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\11\3\1\143\4\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\13\3\1\144\2\3"+
    "\1\0\11\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\16\3"+
    "\1\0\2\3\1\145\6\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\16\3\1\0\4\3\1\146\4\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\14\3\1\147\1\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\14\3\1\150\1\3"+
    "\1\0\11\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\10\3"+
    "\1\151\5\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\14\3\1\152\1\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\10\3\1\153\5\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\6\3\1\154\7\3"+
    "\1\0\11\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\26\0\1\155\43\0\1\3\3\5"+
    "\1\0\16\3\1\0\10\3\1\156\1\0\1\3\6\0"+
    "\2\3\14\0\1\3\1\5\2\0\1\3\1\0\1\3"+
    "\3\5\1\0\13\3\1\157\2\3\1\0\11\3\1\0"+
    "\1\3\6\0\2\3\14\0\1\3\1\5\2\0\1\3"+
    "\50\115\1\0\1\115\2\0\15\115\2\0\1\160\62\0"+
    "\1\160\4\0\1\3\3\5\1\0\16\3\1\0\4\3"+
    "\1\161\4\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\50\162\1\0\1\162\2\0\13\162"+
    "\1\163\1\162\1\0\1\3\3\5\1\0\3\3\1\164"+
    "\12\3\1\0\11\3\1\0\1\3\6\0\2\3\14\0"+
    "\1\3\1\5\2\0\1\3\1\0\1\3\3\5\1\0"+
    "\4\3\1\165\11\3\1\0\11\3\1\0\1\3\6\0"+
    "\2\3\14\0\1\3\1\5\2\0\1\3\1\0\1\3"+
    "\3\5\1\0\16\3\1\0\2\3\1\166\6\3\1\0"+
    "\1\3\6\0\2\3\14\0\1\3\1\5\2\0\1\3"+
    "\1\0\1\3\3\5\1\0\14\3\1\167\1\3\1\0"+
    "\11\3\1\0\1\3\6\0\2\3\14\0\1\3\1\5"+
    "\2\0\1\3\1\0\1\3\3\5\1\0\13\3\1\170"+
    "\2\3\1\0\11\3\1\0\1\3\6\0\2\3\14\0"+
    "\1\3\1\5\2\0\1\3\1\0\1\3\3\5\1\0"+
    "\11\3\1\147\4\3\1\0\11\3\1\0\1\3\6\0"+
    "\2\3\14\0\1\3\1\5\2\0\1\3\1\0\1\3"+
    "\3\5\1\0\15\3\1\171\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\16\3\1\0\2\3\1\172\6\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\11\3\1\173\4\3"+
    "\1\0\11\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\11\3"+
    "\1\174\4\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\16\3\1\0\4\3\1\175\4\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\11\3\1\176\4\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\6\3\1\177\7\3"+
    "\1\0\11\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\10\3"+
    "\1\200\5\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\16\3\1\0\5\3\1\201\3\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\13\3\1\202\2\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\16\3\1\0\2\3"+
    "\1\203\6\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\12\3"+
    "\1\204\3\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\15\3\1\205\1\0\11\3\1\0\1\3\6\0"+
    "\2\3\14\0\1\3\1\5\2\0\1\3\1\0\1\3"+
    "\3\5\1\0\15\3\1\206\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\16\3\1\0\2\3\1\207\6\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\16\3\1\0\7\3"+
    "\1\210\1\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\7\3"+
    "\1\211\6\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\13\3\1\212\2\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\17\0"+
    "\1\213\52\0\1\3\3\5\1\0\16\3\1\0\2\3"+
    "\1\214\6\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\16\3"+
    "\1\0\2\3\1\215\6\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\2\0\1\160\1\216"+
    "\53\0\1\217\5\0\1\160\4\0\1\3\3\5\1\0"+
    "\16\3\1\0\11\3\1\0\1\3\6\0\2\3\14\0"+
    "\1\3\1\220\2\0\1\3\50\162\1\0\1\162\2\0"+
    "\13\162\1\221\1\162\1\0\1\3\3\5\1\0\4\3"+
    "\1\222\11\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\2\3\1\223\13\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\14\3\1\224\1\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\7\3\1\225\6\3"+
    "\1\0\11\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\14\3"+
    "\1\226\1\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\10\3\1\227\5\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\12\3\1\230\3\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\16\3\1\231\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\16\3\1\0\2\3"+
    "\1\100\6\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\14\3"+
    "\1\232\1\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\11\3\1\233\4\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\7\3\1\234\6\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\15\3\1\235\1\0"+
    "\11\3\1\0\1\3\6\0\2\3\14\0\1\3\1\5"+
    "\2\0\1\3\1\0\1\3\3\5\1\0\15\3\1\236"+
    "\1\0\11\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\14\3"+
    "\1\237\1\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\13\3\1\240\2\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\14\3\1\241\1\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\15\3\1\242\1\0"+
    "\11\3\1\0\1\3\6\0\2\3\14\0\1\3\1\5"+
    "\2\0\1\3\1\0\1\3\3\5\1\0\16\3\1\0"+
    "\3\3\1\243\5\3\1\0\1\3\6\0\2\3\14\0"+
    "\1\3\1\5\2\0\1\3\1\0\1\3\3\5\1\0"+
    "\15\3\1\244\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\21\0\1\245\50\0"+
    "\1\3\3\5\1\0\15\3\1\246\1\0\11\3\1\0"+
    "\1\3\6\0\2\3\14\0\1\3\1\5\2\0\1\3"+
    "\2\0\1\247\62\0\1\247\4\0\1\3\1\0\2\5"+
    "\1\0\16\3\1\250\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\3\0\1\3\1\0\1\3\3\5\1\0"+
    "\2\3\1\251\13\3\1\0\11\3\1\0\1\3\6\0"+
    "\2\3\14\0\1\3\1\5\2\0\1\3\1\0\1\3"+
    "\3\5\1\0\5\3\1\252\10\3\1\0\11\3\1\0"+
    "\1\3\6\0\2\3\14\0\1\3\1\5\2\0\1\3"+
    "\1\0\1\3\3\5\1\0\14\3\1\253\1\3\1\0"+
    "\11\3\1\0\1\3\6\0\2\3\14\0\1\3\1\5"+
    "\2\0\1\3\1\0\1\3\3\5\1\0\16\3\1\0"+
    "\3\3\1\254\5\3\1\0\1\3\6\0\2\3\14\0"+
    "\1\3\1\5\2\0\1\3\1\0\1\3\3\5\1\0"+
    "\15\3\1\255\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\13\3\1\256\2\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\15\3\1\257\1\0\11\3\1\0"+
    "\1\3\6\0\2\3\14\0\1\3\1\5\2\0\1\3"+
    "\16\0\1\260\53\0\1\3\3\5\1\0\12\3\1\261"+
    "\3\3\1\0\11\3\1\0\1\3\6\0\2\3\14\0"+
    "\1\3\1\5\2\0\1\3\1\0\1\3\3\5\1\0"+
    "\11\3\1\262\4\3\1\0\11\3\1\0\1\3\6\0"+
    "\2\3\14\0\1\3\1\5\2\0\1\3\1\0\1\3"+
    "\3\5\1\0\16\3\1\0\5\3\1\263\3\3\1\0"+
    "\1\3\6\0\2\3\14\0\1\3\1\5\2\0\1\3"+
    "\1\0\1\3\3\5\1\0\12\3\1\264\3\3\1\0"+
    "\11\3\1\0\1\3\6\0\2\3\14\0\1\3\1\5"+
    "\2\0\1\3\1\0\1\3\3\5\1\0\11\3\1\265"+
    "\4\3\1\0\11\3\1\0\1\3\6\0\2\3\14\0"+
    "\1\3\1\5\2\0\1\3\1\0\1\3\3\5\1\0"+
    "\14\3\1\266\1\3\1\0\11\3\1\0\1\3\6\0"+
    "\2\3\14\0\1\3\1\5\2\0\1\3\1\0\1\3"+
    "\3\5\1\0\16\3\1\267\11\3\1\0\1\3\6\0"+
    "\2\3\14\0\1\3\1\5\2\0\1\3\1\0\1\3"+
    "\3\5\1\0\16\3\1\0\7\3\1\270\1\3\1\0"+
    "\1\3\6\0\2\3\14\0\1\3\1\5\2\0\1\3"+
    "\1\0\1\3\3\5\1\0\15\3\1\271\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\55\0\1\272\14\0\1\3\3\5\1\0\12\3"+
    "\1\273\3\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\2\0\1\247\54\0"+
    "\1\274\5\0\1\247\4\0\1\275\4\0\16\275\1\0"+
    "\11\275\1\0\1\275\6\0\2\275\14\0\1\275\3\0"+
    "\1\275\1\0\1\3\3\5\1\0\1\276\15\3\1\0"+
    "\11\3\1\0\1\3\6\0\2\3\14\0\1\3\1\5"+
    "\2\0\1\3\1\0\1\3\3\5\1\0\16\3\1\0"+
    "\1\3\1\277\7\3\1\0\1\3\6\0\2\3\14\0"+
    "\1\3\1\5\2\0\1\3\1\0\1\3\3\5\1\0"+
    "\7\3\1\300\6\3\1\0\11\3\1\0\1\3\6\0"+
    "\2\3\14\0\1\3\1\5\2\0\1\3\1\0\1\3"+
    "\3\5\1\0\14\3\1\301\1\3\1\0\11\3\1\0"+
    "\1\3\6\0\2\3\14\0\1\3\1\5\2\0\1\3"+
    "\1\0\1\3\3\5\1\0\16\3\1\0\2\3\1\302"+
    "\6\3\1\0\1\3\6\0\2\3\14\0\1\3\1\5"+
    "\2\0\1\3\23\0\1\303\46\0\1\3\3\5\1\0"+
    "\15\3\1\304\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\12\3\1\305\3\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\11\3\1\306\4\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\13\3\1\307\2\3"+
    "\1\0\11\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\15\3"+
    "\1\310\1\0\11\3\1\0\1\3\6\0\2\3\14\0"+
    "\1\3\1\5\2\0\1\3\30\0\1\311\41\0\1\3"+
    "\3\5\1\0\16\3\1\0\2\3\1\312\6\3\1\0"+
    "\1\3\6\0\2\3\14\0\1\3\1\5\2\0\1\3"+
    "\1\0\1\3\3\5\1\0\16\3\1\0\10\3\1\313"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\11\3\1\314\4\3"+
    "\1\0\11\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\275\1\315\3\0\16\275"+
    "\1\0\11\275\1\0\1\275\6\0\2\275\14\0\1\275"+
    "\1\315\2\0\1\275\1\0\1\3\3\5\1\0\2\3"+
    "\1\316\13\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\16\3\1\0\4\3\1\317\4\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\14\3\1\320\1\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\7\3\1\321\6\3"+
    "\1\0\11\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\14\3"+
    "\1\322\1\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\14\0\1\323\55\0"+
    "\1\3\3\5\1\0\14\3\1\324\1\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\1\0\1\3\3\5\1\0\14\3\1\325\1\3"+
    "\1\0\11\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\16\3"+
    "\1\0\2\3\1\326\6\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\6\3\1\147\7\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\15\0"+
    "\1\327\54\0\1\3\3\5\1\0\14\3\1\177\1\3"+
    "\1\0\11\3\1\0\1\3\6\0\2\3\14\0\1\3"+
    "\1\5\2\0\1\3\1\0\1\3\3\5\1\0\5\3"+
    "\1\330\10\3\1\0\11\3\1\0\1\3\6\0\2\3"+
    "\14\0\1\3\1\5\2\0\1\3\1\0\1\3\3\5"+
    "\1\0\13\3\1\23\2\3\1\0\11\3\1\0\1\3"+
    "\6\0\2\3\14\0\1\3\1\5\2\0\1\3\1\0"+
    "\1\3\3\5\1\0\11\3\1\331\4\3\1\0\11\3"+
    "\1\0\1\3\6\0\2\3\14\0\1\3\1\5\2\0"+
    "\1\3\17\0\1\332\52\0\1\3\3\5\1\0\15\3"+
    "\1\333\1\0\11\3\1\0\1\3\6\0\2\3\14\0"+
    "\1\3\1\5\2\0\1\3\27\0\1\334\42\0\1\3"+
    "\3\5\1\0\16\3\1\335\11\3\1\0\1\3\6\0"+
    "\2\3\14\0\1\3\1\5\2\0\1\3\20\0\1\336"+
    "\64\0\1\337\75\0\1\340\64\0\1\341\75\0\1\342"+
    "\71\0\1\343\61\0\1\332\54\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10374];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\37\1\2\11\1\1\5\11\3\1\1\0"+
    "\30\1\1\11\1\0\3\11\3\1\1\0\1\1\1\0"+
    "\1\1\1\0\32\1\1\0\2\1\1\0\1\1\1\0"+
    "\30\1\1\0\2\1\1\0\1\11\11\1\1\0\13\1"+
    "\1\0\1\1\2\0\7\1\1\0\6\1\1\0\2\1"+
    "\1\11\1\1\1\11\6\1\1\0\5\1\1\0\11\1"+
    "\1\0\3\1\1\0\2\1\1\11\1\1\5\0\1\11"+
    "\2\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[227];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 200) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { lexeme=yytext(); return ERROR;
            }
          case 49: break;
          case 2: 
            { lexeme=yytext(); return Numero;
            }
          case 50: break;
          case 3: 
            { /*Ignore*/
            }
          case 51: break;
          case 4: 
            { lexeme=yytext(); return operadores_logicos;
            }
          case 52: break;
          case 5: 
            { lexeme=yytext(); return op_suma;
            }
          case 53: break;
          case 6: 
            { lexeme=yytext(); return op_resta;
            }
          case 54: break;
          case 7: 
            { lexeme=yytext(); return op_asignacion;
            }
          case 55: break;
          case 8: 
            { lexeme=yytext(); return operadores_comparacion;
            }
          case 56: break;
          case 9: 
            { lexeme=yytext(); return linea;
            }
          case 57: break;
          case 10: 
            { lexeme=yytext(); return op_division;
            }
          case 58: break;
          case 11: 
            { lexeme=yytext(); return op_multiplicacion;
            }
          case 59: break;
          case 12: 
            { lexeme=yytext(); return punto_y_coma;
            }
          case 60: break;
          case 13: 
            { lexeme=yytext(); return par_abierto;
            }
          case 61: break;
          case 14: 
            { lexeme=yytext(); return par_cerrado;
            }
          case 62: break;
          case 15: 
            { lexeme=yytext(); return llave_abierta;
            }
          case 63: break;
          case 16: 
            { lexeme=yytext(); return llave_cerrada;
            }
          case 64: break;
          case 17: 
            { lexeme=yytext(); return corchete_abierto;
            }
          case 65: break;
          case 18: 
            { lexeme=yytext(); return corchete_cerrado;
            }
          case 66: break;
          case 19: 
            { lexeme=yytext(); return comillas;
            }
          case 67: break;
          case 20: 
            { lexeme=yytext(); return si;
            }
          case 68: break;
          case 21: 
            { lexeme=yytext(); return incremento;
            }
          case 69: break;
          case 22: 
            { lexeme=yytext(); return decremento;
            }
          case 70: break;
          case 23: 
            { lexeme=yytext(); return comentario;
            }
          case 71: break;
          case 24: 
            { lexeme=yytext(); return cadena_literal;
            }
          case 72: break;
          case 25: 
            { lexeme=yytext(); return Numero_decimal;
            }
          case 73: break;
          case 26: 
            { lexeme=yytext(); return Reservada;
            }
          case 74: break;
          case 27: 
            { lexeme=yytext(); return cadena_simple;
            }
          case 75: break;
          case 28: 
            { lexeme=yytext(); return nulo;
            }
          case 76: break;
          case 29: 
            { lexeme=yytext(); return mapa;
            }
          case 77: break;
          case 30: 
            { lexeme=yytext(); return hora;
            }
          case 78: break;
          case 31: 
            { lexeme=yytext(); return t_byte;
            }
          case 79: break;
          case 32: 
            { lexeme=yytext(); return boleana;
            }
          case 80: break;
          case 33: 
            { lexeme=yytext(); return fecha;
            }
          case 81: break;
          case 34: 
            { lexeme=yytext(); return lista;
            }
          case 82: break;
          case 35: 
            { lexeme=yytext(); return cadena;
            }
          case 83: break;
          case 36: 
            { lexeme=yytext(); return entero;
            }
          case 84: break;
          case 37: 
            { lexeme=yytext(); return Identificador;
            }
          case 85: break;
          case 38: 
            { lexeme=yytext(); return funcion;
            }
          case 86: break;
          case 39: 
            { lexeme=yytext(); return decimal;
            }
          case 87: break;
          case 40: 
            { lexeme=yytext(); return boleano;
            }
          case 88: break;
          case 41: 
            { lexeme=yytext(); return imprimir;
            }
          case 89: break;
          case 42: 
            { lexeme=yytext(); return caracter;
            }
          case 90: break;
          case 43: 
            { lexeme=yytext(); return retornar;
            }
          case 91: break;
          case 44: 
            { lexeme=yytext(); return flotante;
            }
          case 92: break;
          case 45: 
            { lexeme=yytext(); return PRINCIPIO;
            }
          case 93: break;
          case 46: 
            { lexeme=yytext(); return contrario;
            }
          case 94: break;
          case 47: 
            { lexeme=yytext(); return fechahora;
            }
          case 95: break;
          case 48: 
            { lexeme=yytext(); return contrario_si ;
            }
          case 96: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
