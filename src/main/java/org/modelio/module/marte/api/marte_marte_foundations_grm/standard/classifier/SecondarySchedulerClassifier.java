/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Classifier} with << SecondaryScheduler_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ec53fbf6-5737-48a4-bedc-e6bd1231b086")
public class SecondarySchedulerClassifier extends SchedulerClassifier {
    @objid ("35b0c59e-b464-49e8-9480-f011a89b9422")
    public static final String STEREOTYPE_NAME = "SecondaryScheduler_Classifier";

    @objid ("633cfa35-c174-4f84-8882-eb235d1e72be")
    public static final String SECONDARYSCHEDULER_CLASSIFIER_VIRTUALPROCESSINGUNITS_TAGTYPE = "SecondaryScheduler_Classifier_virtualProcessingUnits";

    /**
     * Tells whether a {@link SecondarySchedulerClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SecondaryScheduler_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2be212a9-b61c-4a1a-99eb-255ef241c1a9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SecondaryScheduler_Classifier >> then instantiate a {@link SecondarySchedulerClassifier} proxy.
     * 
     * @return a {@link SecondarySchedulerClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("f3c489bb-d995-4192-8f99-646c020573ca")
    public static SecondarySchedulerClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerClassifier.STEREOTYPE_NAME);
        return SecondarySchedulerClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerClassifier} proxy from a {@link Classifier} stereotyped << SecondaryScheduler_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SecondarySchedulerClassifier} proxy or <i>null</i>.
     */
    @objid ("2e377970-3d04-4f67-ae11-dd6e7a8c0402")
    public static SecondarySchedulerClassifier instantiate(final Classifier obj) {
        return SecondarySchedulerClassifier.canInstantiate(obj) ? new SecondarySchedulerClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerClassifier} proxy from a {@link Classifier} stereotyped << SecondaryScheduler_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SecondarySchedulerClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e2f2c1ed-e01c-4b97-9854-f450785f4a97")
    public static SecondarySchedulerClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SecondarySchedulerClassifier.canInstantiate(obj))
        	return new SecondarySchedulerClassifier(obj);
        else
        	throw new IllegalArgumentException("SecondarySchedulerClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("93634e78-9f14-4547-87a6-6343861a5b1f")
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
        SecondarySchedulerClassifier other = (SecondarySchedulerClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("a5e741ba-27fc-4ce6-b931-23eec7f6e28c")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'SecondaryScheduler_Classifier_virtualProcessingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b338d0e7-8099-4fd7-8a2a-0b397e3fd2c1")
    public List<String> getSecondaryScheduler_Classifier_virtualProcessingUnits() {
        return this.elt.getTagValues(SecondarySchedulerClassifier.MdaTypes.SECONDARYSCHEDULER_CLASSIFIER_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT);
    }

    @objid ("e9c937a4-322f-4a4f-a08f-07cf40712de0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SecondaryScheduler_Classifier_virtualProcessingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7e31349c-f8ce-46bc-bef2-7a36232383cf")
    public void setSecondaryScheduler_Classifier_virtualProcessingUnits(final List<String> values) {
        this.elt.putTagValues(SecondarySchedulerClassifier.MdaTypes.SECONDARYSCHEDULER_CLASSIFIER_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    @objid ("76127f7c-2380-41d2-bf4e-d4efe5d7558d")
    protected SecondarySchedulerClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("b3bc7c6b-6b4a-44a0-a0a1-698437e58f0f")
    public static final class MdaTypes {
        @objid ("0d3db579-4dd6-4ac3-9ab1-e931f1ac43cb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5186ab68-2581-48d4-aa50-1abaaddcc22e")
        public static TagType SECONDARYSCHEDULER_CLASSIFIER_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("d3812f26-6c37-4cbe-9487-f49983e88834")
        private static Stereotype MDAASSOCDEP;

        @objid ("04ceeafd-04a8-4381-95cf-6806b3815093")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("76a66b81-152f-4531-8b83-861c985b369b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "695a1b9d-0f2d-11df-8c52-0014222a9f79");
            SECONDARYSCHEDULER_CLASSIFIER_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7ed70deb-16fa-11df-b92a-0014222a9f79");
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
