package ro.ase.cts.refactoring;

public class StrategieMarketing {
	
	public static final int VECHIME_MAXIMA=10;
	public static final float DISCOUNT_VECHIME_MAXIMA = 0.15f;
	
	
	public static float getDiscount(int vechime) {
		return (vechime > VECHIME_MAXIMA) ? (float) DISCOUNT_VECHIME_MAXIMA/100 : (float)vechime/100;
	}
	
	public static float aplicaDiscount(float pretInitial, float valoareDiscount, float discountExatra) {
		return  (pretInitial - (discountExatra * pretInitial)) - valoareDiscount * (pretInitial - (discountExatra * pretInitial));
	}
	
	public float calculeazaPretFinal(TipProdus tipProdus, float pretInitial, int vechime) {
		float discount = getDiscount(vechime);		
		return (tipProdus != tipProdus.NOU) ? aplicaDiscount(pretInitial, discount, tipProdus.getDiscount()) : pretInitial;
	}
}
