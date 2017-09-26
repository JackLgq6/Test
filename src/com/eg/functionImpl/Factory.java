package com.eg.functionImpl;

import com.eg.base.Animal;
import com.eg.entity.Chicken;
import com.eg.entity.Cow;
import com.eg.entity.Sheep;

public class Factory {

	public void fertility(Animal animal) {

		if (animal instanceof Chicken) {
			fertilityChicken();
		} else if (animal instanceof Cow) {
			fertilityCow();
		} else if (animal instanceof Sheep) {
			fertilitySheep();
		}
	}

	public void sell(Animal animal) {
		if (animal instanceof Chicken) {
			sellChicken();
		} else if (animal instanceof Cow) {
			sellCow();
		} else if (animal instanceof Sheep) {
			sellSheep();
		}
	}

	public void fertilityChicken() {

	}

	public void sellChicken() {

	}

	public void fertilitySheep() {

	}

	public void sellSheep() {

	}

	public void fertilityCow() {

	}

	public void sellCow() {

	}

}
