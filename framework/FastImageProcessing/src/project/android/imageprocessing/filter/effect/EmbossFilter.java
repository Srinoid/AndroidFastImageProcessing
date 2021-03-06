package project.android.imageprocessing.filter.effect;

import project.android.imageprocessing.filter.processing.ConvolutionFilter;

/**
 * Applies an embossing effect on the image
 * intensity: The strength of the embossing, from 0.0 to 4.0, with 1.0 as the normal level
 * @author Chris Batt
 */
public class EmbossFilter extends ConvolutionFilter {
	public EmbossFilter(float intensity) {
		super(new float[] {
				intensity * -2, -intensity, 0f,
				-intensity, 1f, intensity,
				0f, intensity, intensity * 2
		}, 3, 3);
	}
}
