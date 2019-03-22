package export;

import automates.Automate;

public class Deter extends Question{
	
	public Deter(Automate auto) {
		this.setAuto(auto);
		this.setQtype("Deter");
		this.setShortanswer(false);
		this.setQuestion("L'automate donne est-il deterministe ?");
		this.setReminder("On pourra ecrire Vrai, 1 ou True pour Vrai, Faux, 0 ou False pour Faux (attention aux majuscules)");
		String answer = "{1:SHORTANSWER:";
		if(this.getAuto().isDeterminist() == "Determinist") {
			answer += "=Vrai~=True~=1~Faux~False~0}";
		}
		else {
			answer += "=Faux~=False~=0~Vrai~True~1}";
		}
		
		this.setAnswer(answer);
		this.setFeedback("");
		this.setPenalty(0.3333333);
		this.setHidden(0);
	}
	
}
