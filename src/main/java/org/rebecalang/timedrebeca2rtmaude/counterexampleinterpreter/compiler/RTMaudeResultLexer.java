// Generated from RTMaudeResult.g4 by ANTLR 4.3
package org.rebecalang.timedrebeca2rtmaude.counterexampleinterpreter.compiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RTMaudeResultLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, IN=2, TIME=3, COMMA=4, OPENBRACE=5, CLOSEBRACE=6, WITH=7, DMSG=8, 
		EMPTYVAL=9, FROM=10, TO=11, DEADLINE=12, STATEVARS=13, IDGEN=14, REBECQUEUE=15, 
		TOEXEC=16, GT=17, LT=18, DBCOLON=19, COLON=20, NIL=21, ARROW=22, INT=23, 
		BOOL=24, DASHID=25, QID=26, TQID=27, ID=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'"
	};
	public static final String[] ruleNames = {
		"WS", "IN", "TIME", "COMMA", "OPENBRACE", "CLOSEBRACE", "WITH", "DMSG", 
		"EMPTYVAL", "FROM", "TO", "DEADLINE", "STATEVARS", "IDGEN", "REBECQUEUE", 
		"TOEXEC", "GT", "LT", "DBCOLON", "COLON", "NIL", "ARROW", "INT", "BOOL", 
		"DASHID", "QID", "TQID", "ID"
	};


	public RTMaudeResultLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RTMaudeResult.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u011d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\6\2=\n\2\r\2\16\2>\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u0094\n\17\f\17\16\17\u0097\13\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a7\n\20\f\20\16\20"+
		"\u00aa\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u00bd\n\21\f\21\16\21\u00c0\13\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\6\30\u00dd"+
		"\n\30\r\30\16\30\u00de\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u00ea\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0110\n\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\6\35\u011a\n\35\r\35\16\35\u011b"+
		"\5\u0095\u00a8\u00be\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36\3\2\5\6\2\13\f\17\17\"\"*+\3\2\62;\5\2\62;C\\c"+
		"|\u0128\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\3<\3\2\2\2\5B\3\2\2\2\7E\3\2\2\2\tJ\3\2\2\2\13L\3\2\2\2\rN\3\2\2\2"+
		"\17P\3\2\2\2\21U\3\2\2\2\23`\3\2\2\2\25o\3\2\2\2\27t\3\2\2\2\31w\3\2\2"+
		"\2\33\u0080\3\2\2\2\35\u008a\3\2\2\2\37\u009f\3\2\2\2!\u00b1\3\2\2\2#"+
		"\u00ca\3\2\2\2%\u00cc\3\2\2\2\'\u00ce\3\2\2\2)\u00d1\3\2\2\2+\u00d3\3"+
		"\2\2\2-\u00d7\3\2\2\2/\u00dc\3\2\2\2\61\u00e9\3\2\2\2\63\u010f\3\2\2\2"+
		"\65\u0111\3\2\2\2\67\u0115\3\2\2\29\u0119\3\2\2\2;=\t\2\2\2<;\3\2\2\2"+
		"=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\b\2\2\2A\4\3\2\2\2BC\7k\2\2"+
		"CD\7p\2\2D\6\3\2\2\2EF\7v\2\2FG\7k\2\2GH\7o\2\2HI\7g\2\2I\b\3\2\2\2JK"+
		"\7.\2\2K\n\3\2\2\2LM\7}\2\2M\f\3\2\2\2NO\7\177\2\2O\16\3\2\2\2PQ\7y\2"+
		"\2QR\7k\2\2RS\7v\2\2ST\7j\2\2T\20\3\2\2\2UV\7f\2\2VW\7g\2\2WX\7n\2\2X"+
		"Y\7c\2\2YZ\7{\2\2Z[\7g\2\2[\\\7f\2\2\\]\7O\2\2]^\7u\2\2^_\7i\2\2_\22\3"+
		"\2\2\2`a\7g\2\2ab\7o\2\2bc\7r\2\2cd\7v\2\2de\7{\2\2ef\7X\2\2fg\7c\2\2"+
		"gh\7n\2\2hi\7w\2\2ij\7c\2\2jk\7v\2\2kl\7k\2\2lm\7q\2\2mn\7p\2\2n\24\3"+
		"\2\2\2op\7h\2\2pq\7t\2\2qr\7q\2\2rs\7o\2\2s\26\3\2\2\2tu\7v\2\2uv\7q\2"+
		"\2v\30\3\2\2\2wx\7f\2\2xy\7g\2\2yz\7c\2\2z{\7f\2\2{|\7n\2\2|}\7k\2\2}"+
		"~\7p\2\2~\177\7g\2\2\177\32\3\2\2\2\u0080\u0081\7u\2\2\u0081\u0082\7v"+
		"\2\2\u0082\u0083\7c\2\2\u0083\u0084\7v\2\2\u0084\u0085\7g\2\2\u0085\u0086"+
		"\7X\2\2\u0086\u0087\7c\2\2\u0087\u0088\7t\2\2\u0088\u0089\7u\2\2\u0089"+
		"\34\3\2\2\2\u008a\u008b\7$\2\2\u008b\u008c\7k\2\2\u008c\u008d\7f\2\2\u008d"+
		"\u008e\7i\2\2\u008e\u008f\7g\2\2\u008f\u0090\7p\2\2\u0090\u0091\7$\2\2"+
		"\u0091\u0095\3\2\2\2\u0092\u0094\13\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7p\2\2\u0099\u009a\7g\2\2\u009a\u009b\7z\2"+
		"\2\u009b\u009c\7v\2\2\u009c\u009d\7K\2\2\u009d\u009e\7f\2\2\u009e\36\3"+
		"\2\2\2\u009f\u00a0\7T\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7d\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a7\13\2"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7s"+
		"\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7w\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0 \3\2\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4"+
		"\7G\2\2\u00b4\u00b5\7z\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7e\2\2\u00b7"+
		"\u00b8\7w\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7g\2\2\u00ba\u00be\3\2\2"+
		"\2\u00bb\u00bd\13\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c1\u00c2\7|\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5"+
		"\7c\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7K\2\2\u00c8"+
		"\u00c9\7F\2\2\u00c9\"\3\2\2\2\u00ca\u00cb\7@\2\2\u00cb$\3\2\2\2\u00cc"+
		"\u00cd\7>\2\2\u00cd&\3\2\2\2\u00ce\u00cf\7<\2\2\u00cf\u00d0\7<\2\2\u00d0"+
		"(\3\2\2\2\u00d1\u00d2\7<\2\2\u00d2*\3\2\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5\u00d6\7n\2\2\u00d6,\3\2\2\2\u00d7\u00d8\7~\2\2\u00d8\u00d9"+
		"\7/\2\2\u00d9\u00da\7@\2\2\u00da.\3\2\2\2\u00db\u00dd\t\3\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\60\3\2\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7w\2\2\u00e3"+
		"\u00ea\7g\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7n\2\2"+
		"\u00e7\u00e8\7u\2\2\u00e8\u00ea\7g\2\2\u00e9\u00e0\3\2\2\2\u00e9\u00e4"+
		"\3\2\2\2\u00ea\62\3\2\2\2\u00eb\u00ec\59\35\2\u00ec\u00ed\7/\2\2\u00ed"+
		"\u00ee\59\35\2\u00ee\u0110\3\2\2\2\u00ef\u00f0\59\35\2\u00f0\u00f1\7/"+
		"\2\2\u00f1\u00f2\7/\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\59\35\2\u00f4"+
		"\u0110\3\2\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7n\2"+
		"\2\u00f8\u0110\7h\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc"+
		"\7p\2\2\u00fc\u00fd\7f\2\2\u00fd\u00fe\7g\2\2\u00fe\u0110\7t\2\2\u00ff"+
		"\u0100\7e\2\2\u0100\u0101\7q\2\2\u0101\u0102\7p\2\2\u0102\u0103\7u\2\2"+
		"\u0103\u0104\7v\2\2\u0104\u0105\7t\2\2\u0105\u0106\7w\2\2\u0106\u0107"+
		"\7e\2\2\u0107\u0108\7v\2\2\u0108\u0109\7q\2\2\u0109\u0110\7t\2\2\u010a"+
		"\u010b\7)\2\2\u010b\u010c\59\35\2\u010c\u010d\7/\2\2\u010d\u010e\59\35"+
		"\2\u010e\u0110\3\2\2\2\u010f\u00eb\3\2\2\2\u010f\u00ef\3\2\2\2\u010f\u00f5"+
		"\3\2\2\2\u010f\u00f9\3\2\2\2\u010f\u00ff\3\2\2\2\u010f\u010a\3\2\2\2\u0110"+
		"\64\3\2\2\2\u0111\u0112\7$\2\2\u0112\u0113\59\35\2\u0113\u0114\7$\2\2"+
		"\u0114\66\3\2\2\2\u0115\u0116\7)\2\2\u0116\u0117\59\35\2\u01178\3\2\2"+
		"\2\u0118\u011a\t\4\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c:\3\2\2\2\13\2>\u0095\u00a8\u00be\u00de"+
		"\u00e9\u010f\u011b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}