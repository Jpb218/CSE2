// Justin Brock-Smith
// 9/9/2014
// Arithmetic hw01
//cse02

//define class
public class Arithmetic{
    //add main method
    public static void main(String[] args) {
    int nSocks=3; //number of socks
    double sockCost$=2.58; //cost of socks
    int nGlasses=6; //number of glasses
    double glassCost$=2.29; //cost of a glass
    int nEnvelopes=1; //number of envelopes
    double envelopeCost$=3.25; //cost of envelopes
    double taxPercent=.06; //sales tax percentage
    double salestaxsocks$=(nSocks*sockCost$*taxPercent);
    salestaxsocks$=salestaxsocks$*100;
    int salesTaxsocks$=(int) salestaxsocks$;
    double salesTaxSocks$=(double) salesTaxsocks$;
    salesTaxSocks$=salesTaxSocks$/100; //this is to keep the sales tax of socks to two decimal places
    double salestaxglasses$=(nGlasses*glassCost$*taxPercent);
    salestaxglasses$=salestaxglasses$*100;
    int salesTaxglasses$=(int) salestaxglasses$;
    double salesTaxGlasses$=(double) salesTaxglasses$;
    salesTaxGlasses$=salesTaxGlasses$/100;//this does the same for glasses
    double salestaxenvelope$=(nEnvelopes*envelopeCost$*taxPercent);
    salestaxenvelope$=salestaxenvelope$*100;
    int salesTaxenvelope$=(int) salestaxenvelope$;
    double salesTaxEnvelope$=(double) salesTaxenvelope$;
    salesTaxEnvelope$=salesTaxEnvelope$/100;//this does the same for envelopes
    double totalSockcost$=(nSocks*sockCost$+nSocks*sockCost$*taxPercent); //total cost of the socks
    double totalGlassescost$=(nGlasses*glassCost$+nGlasses*glassCost$*taxPercent); //total glasses cost
    double totalEnvelopescost$=(nEnvelopes*envelopeCost$+nEnvelopes*envelopeCost$*taxPercent); //total cost of envelopes
    double totalSalestax$=(nSocks*sockCost$*taxPercent+nGlasses*glassCost$*taxPercent+nEnvelopes*envelopeCost$*taxPercent); //total sales tax of all items
    totalSalestax$=totalSalestax$*100;
    double totalCost$=(nSocks*sockCost$+nGlasses*glassCost$+nEnvelopes*envelopeCost$); //total cost before sales tax added
    int totalRtax$=(int) totalSalestax$;
    double totalsalestax$=(double) totalRtax$;
    totalsalestax$=(totalsalestax$/100);//these few lines are to reduce the decimal places to 2 on the tax.
    double finalCost$=(totalCost$+totalsalestax$)*100;//the final price with sales tax
    int finalcost$=(int) finalCost$;
    double finalRCost$=(double) (finalcost$);//these are to give the final number only two decimal places
    finalRCost$=(finalRCost$/100);
    System.out.println("Your purchase includes " + nSocks +" socks, "
    + nGlasses + " glasses, and " + nEnvelopes + " envelope.");
    System.out.println("The cost of the socks is $"+(nSocks*sockCost$));
    System.out.println("The sales tax on the socks is $"+(salesTaxSocks$));
    System.out.println("The cost of the glasses is $"+(nGlasses*glassCost$));
    System.out.println("The sales tax on the glasses is $"+(salesTaxGlasses$));
    System.out.println("The cost of the envelope is $"+(nEnvelopes*envelopeCost$));
    System.out.println("The sales tax on the envelope is $"+(salesTaxEnvelope$));
    System.out.println("The total cost of all items before tax is $"+(totalCost$));
    System.out.println("the total sales tax for all items is $"+ (totalsalestax$));
    System.out.println("the total price is, therefore $"+(finalRCost$));
    
    
    
        
        
    }
}