/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.classifier.HwResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwISA_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("058737a9-5628-4974-8407-ed6eac83f8fc")
public class HwISAClassifier extends HwResourceClassifier {
    @objid ("8d01f2be-e56b-4fcf-a724-08027097be7e")
    public static final String STEREOTYPE_NAME = "HwISA_Classifier";

    @objid ("cab96ac1-82dd-4c6e-810b-9761d921e4db")
    public static final String HWISA_CLASSIFIER_FAMILY_TAGTYPE = "HwISA_Classifier_family";

    @objid ("2ec9b941-84da-4a7d-91f8-fd0714ea7a4f")
    public static final String HWISA_CLASSIFIER_INST_WIDTH_TAGTYPE = "HwISA_Classifier_inst_Width";

    @objid ("9d10ff30-cf78-4426-a1a3-04a9bc2ae062")
    public static final String HWISA_CLASSIFIER_TYPE_TAGTYPE = "HwISA_Classifier_type";

    /**
     * Tells whether a {@link HwISAClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwISA_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bdb970d2-a9d1-424f-b1e6-d45042636704")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISAClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwISA_Classifier >> then instantiate a {@link HwISAClassifier} proxy.
     * 
     * @return a {@link HwISAClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("77ff41c7-6d42-42d6-a85e-54f5ad5da5bd")
    public static HwISAClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISAClassifier.STEREOTYPE_NAME);
        return HwISAClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwISAClassifier} proxy from a {@link Classifier} stereotyped << HwISA_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwISAClassifier} proxy or <i>null</i>.
     */
    @objid ("29b02222-1be8-440c-9edd-2b09a7596d0d")
    public static HwISAClassifier instantiate(final Classifier obj) {
        return HwISAClassifier.canInstantiate(obj) ? new HwISAClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwISAClassifier} proxy from a {@link Classifier} stereotyped << HwISA_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwISAClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("708244a3-b3af-42b0-837d-1915fd54d85a")
    public static HwISAClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwISAClassifier.canInstantiate(obj))
        	return new HwISAClassifier(obj);
        else
        	throw new IllegalArgumentException("HwISAClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("20e5b0bf-f83b-402d-8df0-1ee05013c934")
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
        HwISAClassifier other = (HwISAClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("fb68904e-80a5-4b94-8014-ff6be27a1833")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwISA_Classifier_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6cce726d-ffa4-4962-9ad3-219ccfca8819")
    public String getHwISA_Classifier_family() {
        return this.elt.getTagValue(HwISAClassifier.MdaTypes.HWISA_CLASSIFIER_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Classifier_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("15ff9322-6fbf-4a7b-87bd-330333a6a691")
    public String getHwISA_Classifier_inst_Width() {
        return this.elt.getTagValue(HwISAClassifier.MdaTypes.HWISA_CLASSIFIER_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30b882c3-8a21-47ea-ac2a-d3606fb1d9ad")
    public String getHwISA_Classifier_type() {
        return this.elt.getTagValue(HwISAClassifier.MdaTypes.HWISA_CLASSIFIER_TYPE_TAGTYPE_ELT);
    }

    @objid ("7fb12db1-c192-4849-b411-1fd1a08ea945")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_Classifier_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9fed217-127a-4714-83e7-ae6a71acfcfb")
    public void setHwISA_Classifier_family(final String value) {
        this.elt.putTagValue(HwISAClassifier.MdaTypes.HWISA_CLASSIFIER_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Classifier_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0ec309a1-b82e-432e-b599-7068b366568d")
    public void setHwISA_Classifier_inst_Width(final String value) {
        this.elt.putTagValue(HwISAClassifier.MdaTypes.HWISA_CLASSIFIER_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("de2e8a84-03c5-412f-a054-3c78e1f7be39")
    public void setHwISA_Classifier_type(final String value) {
        this.elt.putTagValue(HwISAClassifier.MdaTypes.HWISA_CLASSIFIER_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("a3f35994-2f98-42f5-877d-e309f4055eb8")
    protected HwISAClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("8c9f59a2-23c1-406a-acbc-13e2db3a596c")
    public static final class MdaTypes {
        @objid ("220389d6-bf97-4c85-a231-46db6835950a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fb598350-8cf8-418e-8e54-1adac2f58251")
        public static TagType HWISA_CLASSIFIER_FAMILY_TAGTYPE_ELT;

        @objid ("be883dbc-5de6-4e7a-bb09-3b3f39419242")
        public static TagType HWISA_CLASSIFIER_INST_WIDTH_TAGTYPE_ELT;

        @objid ("c357b763-7b97-44e2-bc27-b4668640075d")
        public static TagType HWISA_CLASSIFIER_TYPE_TAGTYPE_ELT;

        @objid ("a088bf31-4fe3-4eb0-a819-cc22a15b3959")
        private static Stereotype MDAASSOCDEP;

        @objid ("286e55a3-fdae-40f2-8299-0e0d2cd85e28")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d9877a0-019a-432c-aa36-160df86ce1e6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3a37177f-10a7-11df-81d9-0014222a9f79");
            HWISA_CLASSIFIER_FAMILY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3a371780-10a7-11df-81d9-0014222a9f79");
            HWISA_CLASSIFIER_INST_WIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3a371781-10a7-11df-81d9-0014222a9f79");
            HWISA_CLASSIFIER_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3a371782-10a7-11df-81d9-0014222a9f79");
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
