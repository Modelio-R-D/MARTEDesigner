/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("7188438f-a059-4602-a4d2-22c1fe41b0bf")
    public static final String STEREOTYPE_NAME = "TimerResource_Classifier";

    @objid ("ea784e00-086d-4c2f-9f99-06abe0d750ac")
    public static final String TIMERRESOURCE_CLASSIFIER_DURATION_TAGTYPE = "TimerResource_Classifier_duration";

    @objid ("5b4e7f34-1cf4-45f4-bc7a-3a7ba980e7c1")
    public static final String TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE = "TimerResource_Classifier_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << TimerResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4a4e3f6c-5acc-4bdb-9647-743a4aa4c1c3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << TimerResource_Classifier >> then instantiate a {@link TimerResourceClassifier} proxy.
     * 
     * @return a {@link TimerResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("f76508c0-c3e3-4343-9134-19b40c097718")
    public static TimerResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceClassifier.STEREOTYPE_NAME);
        return TimerResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceClassifier} proxy from a {@link Classifier} stereotyped << TimerResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link TimerResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("4955df6e-ec11-464f-b2a0-1b1690c368ad")
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
    @objid ("ee5736de-853e-4058-a866-5600d216fe25")
    public static TimerResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (TimerResourceClassifier.canInstantiate(obj))
        	return new TimerResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("TimerResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("513ebb1d-e8c6-422e-8795-2d6a97eabeee")
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
    @objid ("860294e1-a9e6-4110-96df-c274d98f2faa")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Classifier_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2eff40c7-c1b1-4ee5-b982-16cb522b91ce")
    public String getTimerResource_Classifier_duration() {
        return this.elt.getTagValue(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_DURATION_TAGTYPE_ELT);
    }

    @objid ("e22b1518-9438-4f99-90e8-91ebf2d2ac55")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Classifier_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da888d89-3134-4b60-ad1e-0a11e591bab8")
    public boolean isTimerResource_Classifier_isPeriodic() {
        return this.elt.isTagged(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Classifier_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1e5891e0-f7b1-4ee3-956c-7e194e496a75")
    public void setTimerResource_Classifier_duration(final String value) {
        this.elt.putTagValue(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Classifier_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2b276f34-0075-4aad-9a46-f0648b9b86a0")
    public void setTimerResource_Classifier_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceClassifier.MdaTypes.TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE_ELT);
    }

    @objid ("71e267ba-c828-4ab2-9b2f-17d75c688711")
    protected TimerResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("f891975e-06d8-402a-835c-5a6f4afc31a5")
    public static final class MdaTypes {
        @objid ("520c399b-5f2e-44fc-a71d-3a9490ba417b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a3eaa3b8-af95-4016-b401-65c638551aa7")
        public static TagType TIMERRESOURCE_CLASSIFIER_DURATION_TAGTYPE_ELT;

        @objid ("f4fe6841-33e0-4495-b20e-81cd845ee8fd")
        public static TagType TIMERRESOURCE_CLASSIFIER_ISPERIODIC_TAGTYPE_ELT;

        @objid ("53c164ba-20cc-49e4-93cc-6b149601e67a")
        private static Stereotype MDAASSOCDEP;

        @objid ("304834a4-0ded-4069-bcad-a8406f250564")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7948f992-7cf2-48cd-9e93-593e06ca5979")
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
