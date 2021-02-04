/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("1b9de330-fd87-49a9-9816-240100ada3c9")
    public static final String STEREOTYPE_NAME = "HwArbiter_Classifier";

    @objid ("e5c557f6-438b-4b15-be7d-6345badf9a7d")
    public static final String HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS_TAGTYPE = "HwArbiter_Classifier_controlledMedias";

    /**
     * Tells whether a {@link HwArbiterClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwArbiter_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bba49c1e-5336-4702-add7-369edace3d10")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwArbiter_Classifier >> then instantiate a {@link HwArbiterClassifier} proxy.
     * 
     * @return a {@link HwArbiterClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("a7ba3e04-0aa5-4847-ae40-bf3a5441d810")
    public static HwArbiterClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterClassifier.STEREOTYPE_NAME);
        return HwArbiterClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwArbiterClassifier} proxy from a {@link Classifier} stereotyped << HwArbiter_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwArbiterClassifier} proxy or <i>null</i>.
     */
    @objid ("02dd9197-aa21-46b2-80cc-ab1293c73545")
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
    @objid ("2846684b-4373-4fc8-b6d8-00989a1c0fe9")
    public static HwArbiterClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwArbiterClassifier.canInstantiate(obj))
        	return new HwArbiterClassifier(obj);
        else
        	throw new IllegalArgumentException("HwArbiterClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f372ef63-dfa9-431b-9374-d347b9599455")
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
    @objid ("f745c6ae-68e6-44f0-a46f-c82d2b5051e3")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwArbiter_Classifier_controlledMedias'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("63bd45ff-8bb9-4dc4-b903-35ea317afcee")
    public List<String> getHwArbiter_Classifier_controlledMedias() {
        return this.elt.getTagValues(HwArbiterClassifier.MdaTypes.HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS_TAGTYPE_ELT);
    }

    @objid ("03a2ccbf-a661-4dcd-a5e1-bc4ef62e71f4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwArbiter_Classifier_controlledMedias'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f5874fac-6262-4de9-bec0-de990e41d135")
    public void setHwArbiter_Classifier_controlledMedias(final List<String> values) {
        this.elt.putTagValues(HwArbiterClassifier.MdaTypes.HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS_TAGTYPE_ELT, values);
    }

    @objid ("2a6e8610-ea5e-43bd-8b89-ec5a215180b3")
    protected HwArbiterClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("3d59b60a-9ad5-48ac-b464-7bebe8567bca")
    public static final class MdaTypes {
        @objid ("7a78d588-84fc-418f-b83b-4f9e108861ad")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("286aa475-af8f-4e68-8108-1549a3bf0474")
        public static TagType HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS_TAGTYPE_ELT;

        @objid ("f5a9b4eb-4484-40a1-9065-b9955faab73f")
        private static Stereotype MDAASSOCDEP;

        @objid ("593f3a8a-07c0-40f3-8caf-2ca46cb11944")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("689e5bbd-7945-4f77-aabd-11fc6d891083")
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
