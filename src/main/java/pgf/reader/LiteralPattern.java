package pgf.reader;

public class LiteralPattern extends Pattern {
Literal value;

public LiteralPattern(Literal _value)
{value = _value; }

public String toString()
{return "Literal Pattern : "+value.toString();}
}
