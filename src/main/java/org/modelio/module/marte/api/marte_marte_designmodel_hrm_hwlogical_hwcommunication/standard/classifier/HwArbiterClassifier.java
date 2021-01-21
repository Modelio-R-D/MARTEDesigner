/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << HwArbiter_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("02982a80-cdb2-446b-ae65-26eadb087894")
public class HwArbiterClassifier extends HwCommunicationResourceClassifier {
    @objid ("83e33288-4b07-49c0-838a-7206a487e0a3")
    public static final String STEREOTYPE_NAME = "HwArbiter_Classifier";

    @objid ("186a182e-0733-46c1-b93d-d4226493ca28")
    public static final String HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS_TAGTYPE = "HwArbiter_Classifier_controlledMedias";

    /**
     * Tells whether a {@link HwArbiterClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwArbiter_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fc093adc-b1cc-47cf-a346-8c479abf68ad")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwArbiter_Classifier >> then instantiate a {@link HwArbiterClassifier} proxy.
     * 
     * @return a {@link HwArbiterClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("8d7f97e5-606e-4ea7-aa5b-f46d95330db6")
    public static HwArbiterClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterClassifier.STEREOTYPE_NAME);
        return HwArbiterClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwArbiterClassifier} proxy from a {@link Classifier} stereotyped << HwArbiter_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwArbiterClassifier} proxy or <i>null</i>.
     */
    @objid ("a406993d-ab88-4b53-87eb-476a66777505")
    public static HwArbiterClassifier instantiate(final Classifier obj) {
        return HwArbiterClassifier.canInstantiate(obj) ? new HwArbiterClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwArbiterClassifier} proxy from a {@link Classifier} stereotyped << HwArbiter_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwArbiterClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b8291102-0042-4f74-9085-690c21fcbce4")
    public static HwArbiterClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwArbiterClassifier.canInstantiate(obj))
        	return new HwArbiterClassifier(obj);
        else
        	throw new IllegalArgumentException("HwArbiterClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7a165041-9dad-46ef-8de6-e5edbeec0e5c")
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
        HwArbiterClassifier other = (HwArbiterClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("d6ad93b6-7931-4f78-ae3b-c7cbb256df52")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwArbiter_Classifier_controlledMedias'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ea61bf44-7fff-442c-b6db-df81c620ebb6")
    public List<String> getHwArbiter_Classifier_controlledMedias() {
        return this.elt.getTagValues(HwArbiterClassifier.MdaTypes.HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS_TAGTYPE_ELT);
    }

    @objid ("c061403e-5fcc-49ec-be2b-5bf2240c6c32")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwArbiter_Classifier_controlledMedias'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a7fd59b-78d8-4b74-bd90-69e9a1692987")
    public void setHwArbiter_Classifier_controlledMedias(final List<String> values) {
        this.elt.putTagValues(HwArbiterClassifier.MdaTypes.HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS_TAGTYPE_ELT, values);
    }

    @objid ("aad07f4f-820c-4e7e-8a51-b8bb426519a1")
    protected HwArbiterClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("3d59b60a-9ad5-48ac-b464-7bebe8567bca")
    public static final class MdaTypes {
        @objid ("74960a86-5887-49fa-aa04-98f16294a46a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cd7d9cf9-670b-4df3-b1ab-2e74b8f6f78c")
        public static TagType HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS_TAGTYPE_ELT;

        @objid ("00da9093-f112-4d20-a422-54e5256dbd56")
        private static Stereotype MDAASSOCDEP;

        @objid ("fe5cb850-9a65-4055-b8ca-f08aa6ad6a65")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("75ee4a3b-88f2-420a-867f-f732e90b67e7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5e83ce17-10ad-11df-81d9-0014222a9f79");
            HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5e83ce18-10ad-11df-81d9-0014222a9f79");
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
