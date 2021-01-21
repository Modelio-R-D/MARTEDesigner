/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << HwPLD_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("aeda8c13-5c76-42ea-aba1-b493e885d494")
public class HwPLDClassifier extends HwComputingResourceClassifier {
    @objid ("aa374606-be55-4ef9-9365-d2aa47d48a0a")
    public static final String STEREOTYPE_NAME = "HwPLD_Classifier";

    @objid ("02edc726-209f-4c1b-b7f9-566e289efe59")
    public static final String HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Classifier_blocksComputing";

    @objid ("3b2bab55-bc3d-497e-8a02-3bf3538c7eeb")
    public static final String HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE = "HwPLD_Classifier_blocksRAM";

    @objid ("4fad41cf-ec34-4719-97a1-a59f2225b1f2")
    public static final String HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE = "HwPLD_Classifier_nbFlipFlops";

    @objid ("d25792c9-3cdd-43de-9a24-2e2ae18c2994")
    public static final String HWPLD_CLASSIFIER_NBLUTS_TAGTYPE = "HwPLD_Classifier_nbLUTs";

    @objid ("77d06ed6-7f99-4b45-9d29-8680d5984f8a")
    public static final String HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE = "HwPLD_Classifier_ndLUT_Inputs";

    @objid ("192b1b8a-64f1-45b9-9d5a-d6c1ce380704")
    public static final String HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE = "HwPLD_Classifier_organization";

    @objid ("7699fdeb-bd91-4f35-b301-c31d4e7f692d")
    public static final String HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE = "HwPLD_Classifier_technology";

    /**
     * Tells whether a {@link HwPLDClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwPLD_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7f18239f-6f9e-4fbc-88a5-4a87005af553")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwPLD_Classifier >> then instantiate a {@link HwPLDClassifier} proxy.
     * 
     * @return a {@link HwPLDClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("b7a59f8d-777d-4680-a4f6-9244fa79a546")
    public static HwPLDClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDClassifier.STEREOTYPE_NAME);
        return HwPLDClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDClassifier} proxy from a {@link Classifier} stereotyped << HwPLD_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwPLDClassifier} proxy or <i>null</i>.
     */
    @objid ("79c0b89b-8d42-494e-b74a-d4d604ef7689")
    public static HwPLDClassifier instantiate(final Classifier obj) {
        return HwPLDClassifier.canInstantiate(obj) ? new HwPLDClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPLDClassifier} proxy from a {@link Classifier} stereotyped << HwPLD_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwPLDClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2649084d-97c2-456c-ac2f-97222715a84e")
    public static HwPLDClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwPLDClassifier.canInstantiate(obj))
        	return new HwPLDClassifier(obj);
        else
        	throw new IllegalArgumentException("HwPLDClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0cdc82da-15da-4ebe-8e95-853a3db2625d")
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
        HwPLDClassifier other = (HwPLDClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("2c3424ce-f211-48e9-9e7d-965a033805f7")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_Classifier_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cb150d4d-5741-4456-87f8-80547739db19")
    public List<String> getHwPLD_Classifier_blocksComputing() {
        return this.elt.getTagValues(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Classifier_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bea44691-068e-41d7-82a2-140b6614df61")
    public List<String> getHwPLD_Classifier_blocksRAM() {
        return this.elt.getTagValues(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ace09de3-9bd4-4d24-bd5e-b1fc7fadf70e")
    public String getHwPLD_Classifier_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2daad25a-92a4-4999-9233-265bc72237f9")
    public String getHwPLD_Classifier_nbLUTs() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("962b1c2e-e230-4812-a0f3-231284d1ea3a")
    public String getHwPLD_Classifier_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c8ed726-df67-4b32-942b-17af6a206443")
    public String getHwPLD_Classifier_organization() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("407e8602-004e-4b2b-a676-a4c759d1d118")
    public String getHwPLD_Classifier_technology() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE_ELT);
    }

    @objid ("c2658b51-7797-4dcb-9e0a-2e74d5ded29f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Classifier_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fb0d540f-c764-4ae9-96e3-e84622733fa0")
    public void setHwPLD_Classifier_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Classifier_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("311c5a40-4249-4207-98d0-31faa83b1a74")
    public void setHwPLD_Classifier_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0caa0bbc-7758-46bf-9ca2-1980223960a5")
    public void setHwPLD_Classifier_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1f12591-b250-4ff6-98b6-bae1fcf24413")
    public void setHwPLD_Classifier_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a58b9e6-cea4-4be9-9a75-3c80ed479839")
    public void setHwPLD_Classifier_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f86dbff-79b9-4ed8-a0ae-46685908bf39")
    public void setHwPLD_Classifier_organization(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d63aaad8-0ff1-47e2-a9d7-f758f58fc0a9")
    public void setHwPLD_Classifier_technology(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    @objid ("56908de2-3288-431b-9e88-67a107b09ec9")
    protected HwPLDClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("65da2bf8-9599-4ed7-a44c-47072bb1ca28")
    public static final class MdaTypes {
        @objid ("fc6ae6f1-28b5-4301-8b65-37c06a57e853")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cb80bc14-bcba-48f3-9d43-4b78bb50df8c")
        public static TagType HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE_ELT;

        @objid ("0a90afb5-c6b0-4199-9e1d-ebfd14fb4c9d")
        public static TagType HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT;

        @objid ("d6bb316e-10f0-4b37-bc81-50f4250b73d3")
        public static TagType HWPLD_CLASSIFIER_NBLUTS_TAGTYPE_ELT;

        @objid ("307f6376-7204-4b41-876d-4969beec2e0c")
        public static TagType HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE_ELT;

        @objid ("31376843-23be-4102-a266-9ce6d2a943cc")
        public static TagType HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE_ELT;

        @objid ("13a15c20-daf3-4e5a-9883-437f32684d49")
        public static TagType HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE_ELT;

        @objid ("99c75bbb-f251-4f8b-b2ed-daafc91e3d7d")
        public static TagType HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE_ELT;

        @objid ("471185bd-9846-4fae-940f-f37091c1d446")
        private static Stereotype MDAASSOCDEP;

        @objid ("e6ade277-0194-4d8b-8612-2ccd86d7c5fe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c5afdf33-3e36-4277-8179-63123c7c31d7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7495c7c8-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7c9-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7ca-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_NBLUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7cb-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7cc-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7cd-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7ce-10a5-11df-81d9-0014222a9f79");
            HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7495c7cf-10a5-11df-81d9-0014222a9f79");
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
