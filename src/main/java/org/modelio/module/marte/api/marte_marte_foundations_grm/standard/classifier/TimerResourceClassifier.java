/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << TimerResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimerResourceClassifier extends TimingResourceClassifier {
    public static final String STEREOTYPE_NAME = "TimerResource_Classifier";

    public static final String TIMERRESOURCE_CLASSIFIER_DURATION_TAGTYPE = "TimerResource_Classifier_duration";

    public static final String TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE = "TimerResource_Classifier_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << TimerResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << TimerResource_Classifier >> then instantiate a {@link TimerResourceClassifier} proxy.
     * 
     * @return a {@link TimerResourceClassifier} proxy on the created {@link Classifier}.
     */
    public static TimerResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceClassifier.STEREOTYPE_NAME);
        return TimerResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceClassifier} proxy from a {@link Classifier} stereotyped << TimerResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link TimerResourceClassifier} proxy or <i>null</i>.
     */
    public static TimerResourceClassifier instantiate(final Classifier obj) {
        return TimerResourceClassifier.canInstantiate(obj) ? new TimerResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceClassifier} proxy from a {@link Classifier} stereotyped << TimerResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link TimerResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimerResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (TimerResourceClassifier.canInstantiate(obj))
        	return new TimerResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("TimerResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TimerResourceClassifier other = (TimerResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Classifier_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimerResource_Classifier_duration() {
        return this.elt.getTagValue(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_DURATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Classifier_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isTimerResource_Classifier_isPeriodic() {
        return this.elt.isTagged(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Classifier_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Classifier_duration(final String value) {
        this.elt.putTagValue(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Classifier_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Classifier_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE_ELT);
    }

    protected TimerResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMERRESOURCE_CLASSIFIER_DURATION_TAGTYPE_ELT;

        public static TagType TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5ff86705-0f4c-11df-8c52-0014222a9f79");
            TIMERRESOURCE_CLASSIFIER_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7df760b2-14c6-11df-92f7-001302895b2b");
            TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "847ebc18-14c6-11df-92f7-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
