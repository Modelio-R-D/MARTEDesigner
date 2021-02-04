/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("eb0abd3c-d385-49af-98ff-cc3502be9718")
public class TimerResourceClassifier extends TimingResourceClassifier {
    @objid ("de4819e3-a3bb-4cbf-a300-113ad9e51e03")
    public static final String STEREOTYPE_NAME = "TimerResource_Classifier";

    @objid ("582747cf-e27d-4958-968d-ce50eeab5df6")
    public static final String TIMERRESOURCE_CLASSIFIER_DURATION_TAGTYPE = "TimerResource_Classifier_duration";

    @objid ("ecb85adc-71db-4bb7-903b-aa8ad8383d41")
    public static final String TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE = "TimerResource_Classifier_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << TimerResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bcc74c70-8d6e-4071-82f0-947cb2e8afd4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << TimerResource_Classifier >> then instantiate a {@link TimerResourceClassifier} proxy.
     * 
     * @return a {@link TimerResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("0c547385-a8e4-44ed-bcdd-1538fcfe4155")
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
    @objid ("a7b13119-8439-4064-95ba-911ea335b572")
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
    @objid ("4fec1bd0-44ec-4d3a-80c0-964d7a3d3108")
    public static TimerResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (TimerResourceClassifier.canInstantiate(obj))
        	return new TimerResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("TimerResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("38bad33c-9e14-4f8f-b05e-f6af906592f5")
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
    @objid ("f4eaf7dd-97cf-4ed6-9467-79560e36f80b")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Classifier_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a87918a-8a13-470e-b5da-3f83412960fd")
    public String getTimerResource_Classifier_duration() {
        return this.elt.getTagValue(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_DURATION_TAGTYPE_ELT);
    }

    @objid ("db17dbf7-12f2-4c1a-9107-5e2c27dd0a81")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Classifier_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b5f937b-d7cc-40fe-b657-7af00d36dd87")
    public boolean isTimerResource_Classifier_isPeriodic() {
        return this.elt.isTagged(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Classifier_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0de3171-5906-4345-9f59-f9e1bcc14fb7")
    public void setTimerResource_Classifier_duration(final String value) {
        this.elt.putTagValue(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Classifier_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8a412492-2f32-4172-9a69-4ab317469afe")
    public void setTimerResource_Classifier_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE_ELT);
    }

    @objid ("e79343ca-61bd-4a1f-a9f4-6d1ea8bca7b2")
    protected TimerResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("f891975e-06d8-402a-835c-5a6f4afc31a5")
    public static final class MdaTypes {
        @objid ("624003ba-e180-4801-a24d-aa857db2c9f9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("216aefae-619c-439b-bd33-9c57118cffef")
        public static TagType TIMERRESOURCE_CLASSIFIER_DURATION_TAGTYPE_ELT;

        @objid ("d38d5cec-e7ca-42fe-9e43-fd0e02125cab")
        public static TagType TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE_ELT;

        @objid ("f5596b2b-5ff9-4b83-8061-235e9ecff724")
        private static Stereotype MDAASSOCDEP;

        @objid ("b67b5b7f-0851-433e-b6a3-50139c49bf64")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("604f60eb-17ce-4875-ab61-38fcb73d74b9")
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
