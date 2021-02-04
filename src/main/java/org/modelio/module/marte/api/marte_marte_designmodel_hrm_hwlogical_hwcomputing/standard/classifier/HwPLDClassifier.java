/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("dd79c699-ba13-4cc2-81cc-10ad9cca171c")
    public static final String STEREOTYPE_NAME = "HwPLD_Classifier";

    @objid ("db97ab81-e566-4bd0-897d-65348f145514")
    public static final String HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE = "HwPLD_Classifier_blocksComputing";

    @objid ("a5bc94c9-511c-4fa9-9582-a402581fefa4")
    public static final String HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE = "HwPLD_Classifier_blocksRAM";

    @objid ("9b557d46-3d37-4bef-a7c2-82ac8f295db8")
    public static final String HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE = "HwPLD_Classifier_nbFlipFlops";

    @objid ("3a8555c2-0c27-4995-b241-825a4db4cfd3")
    public static final String HWPLD_CLASSIFIER_NBLUTS_TAGTYPE = "HwPLD_Classifier_nbLUTs";

    @objid ("4565b62f-935d-4969-97ef-6a798c60cd87")
    public static final String HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE = "HwPLD_Classifier_ndLUT_Inputs";

    @objid ("a7338b05-84fe-484c-8c55-47d3dd9cf383")
    public static final String HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE = "HwPLD_Classifier_organization";

    @objid ("443536b8-ce74-453d-b2b7-055d56b7929b")
    public static final String HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE = "HwPLD_Classifier_technology";

    /**
     * Tells whether a {@link HwPLDClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwPLD_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b0d5598c-1633-453d-b73d-a2b6db36e4a2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwPLD_Classifier >> then instantiate a {@link HwPLDClassifier} proxy.
     * 
     * @return a {@link HwPLDClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("a2cb129c-64a4-4cb7-b73d-311980d35333")
    public static HwPLDClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPLDClassifier.STEREOTYPE_NAME);
        return HwPLDClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwPLDClassifier} proxy from a {@link Classifier} stereotyped << HwPLD_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwPLDClassifier} proxy or <i>null</i>.
     */
    @objid ("f9e38e57-b456-49e7-9b50-dbbec5a37bbc")
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
    @objid ("349cd0e6-26c5-4e25-9364-74ff03fb9643")
    public static HwPLDClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwPLDClassifier.canInstantiate(obj))
        	return new HwPLDClassifier(obj);
        else
        	throw new IllegalArgumentException("HwPLDClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0bd1d7d5-a2bf-4d27-9c96-2a50534e14a3")
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
    @objid ("365fc171-f8e6-4170-a67a-e83ac01c26b7")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwPLD_Classifier_blocksComputing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e656d1a5-a2d8-41bf-ae4e-76449e00b73f")
    public List<String> getHwPLD_Classifier_blocksComputing() {
        return this.elt.getTagValues(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwPLD_Classifier_blocksRAM'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bc36ca9c-5a89-493c-913d-8eb0b0fb7182")
    public List<String> getHwPLD_Classifier_blocksRAM() {
        return this.elt.getTagValues(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f2921fd6-2ccb-434d-baf5-42b92f602bfe")
    public String getHwPLD_Classifier_nbFlipFlops() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3b163e59-da05-47e3-adb5-9393997f88ea")
    public String getHwPLD_Classifier_nbLUTs() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NBLUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("283938ab-3662-44a1-b126-9ca6a9df3b53")
    public String getHwPLD_Classifier_ndLUT_Inputs() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("331181fd-ad91-4579-9e3b-b526f110fad4")
    public String getHwPLD_Classifier_organization() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPLD_Classifier_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5243c03e-cb66-4984-b2b9-d65f382f28ec")
    public String getHwPLD_Classifier_technology() {
        return this.elt.getTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE_ELT);
    }

    @objid ("0415c180-cfda-4724-bef5-de871c558d3e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwPLD_Classifier_blocksComputing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e641a879-8cb9-4e75-89ce-d095f9328c82")
    public void setHwPLD_Classifier_blocksComputing(final List<String> values) {
        this.elt.putTagValues(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwPLD_Classifier_blocksRAM'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db6c095e-5ef1-49b7-9a25-cb83e80d0b20")
    public void setHwPLD_Classifier_blocksRAM(final List<String> values) {
        this.elt.putTagValues(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_nbFlipFlops'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3b991171-b903-40c0-929b-76aedcd41a30")
    public void setHwPLD_Classifier_nbFlipFlops(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_nbLUTs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1ab38a7-8332-40d8-8f0e-279c4c3ae318")
    public void setHwPLD_Classifier_nbLUTs(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NBLUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_ndLUT_Inputs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9c7b468c-a7b9-4330-8f0e-3d547de6dc97")
    public void setHwPLD_Classifier_ndLUT_Inputs(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b78c241-18e1-4beb-86c0-5dff31da8966")
    public void setHwPLD_Classifier_organization(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPLD_Classifier_technology'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("340421b6-69f2-47d8-bf1e-002a2d441810")
    public void setHwPLD_Classifier_technology(final String value) {
        this.elt.putTagValue(HwPLDClassifier.MdaTypes.HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE_ELT, value);
    }

    @objid ("672a7b5c-7801-4e4e-a038-df4ec2dcbce8")
    protected HwPLDClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("65da2bf8-9599-4ed7-a44c-47072bb1ca28")
    public static final class MdaTypes {
        @objid ("aaf3f2ca-f21f-4b45-a4d1-049cfe6056dc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2354a16d-ed5e-4155-a151-1151ab6f1707")
        public static TagType HWPLD_CLASSIFIER_TECHNOLOGY_TAGTYPE_ELT;

        @objid ("149f56b2-5a11-4e1e-81f5-e546e9280748")
        public static TagType HWPLD_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT;

        @objid ("5aa2039e-c588-4dac-9ed4-2d385c06837f")
        public static TagType HWPLD_CLASSIFIER_NBLUTS_TAGTYPE_ELT;

        @objid ("0ed8b33e-79d3-4307-abec-7b5f3bf443c3")
        public static TagType HWPLD_CLASSIFIER_NDLUT_INPUTS_TAGTYPE_ELT;

        @objid ("c316f46e-2cc8-426c-87d5-82a6f1d4ac45")
        public static TagType HWPLD_CLASSIFIER_NBFLIPFLOPS_TAGTYPE_ELT;

        @objid ("52f1c2e0-e875-4877-9f1b-b2bbddbd9c18")
        public static TagType HWPLD_CLASSIFIER_BLOCKSRAM_TAGTYPE_ELT;

        @objid ("bc4df39c-3a1d-4296-a98f-5eee2cc58e7d")
        public static TagType HWPLD_CLASSIFIER_BLOCKSCOMPUTING_TAGTYPE_ELT;

        @objid ("222a9813-428e-4188-896b-0e897e739a54")
        private static Stereotype MDAASSOCDEP;

        @objid ("3c3b814e-8aaf-454d-b806-41b0c9f4a44f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ea222853-4bf0-4b94-a3f7-dd83094580e1")
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
