/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.StorageResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwMemory_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9afc4bb4-7974-45bf-857a-d0ade853399e")
public class HwMemoryLifeline extends StorageResourceLifeline {
    @objid ("0d766786-cafa-4c7e-a72e-0154450156aa")
    public static final String STEREOTYPE_NAME = "HwMemory_Lifeline";

    @objid ("0afce08f-b0b5-46ea-a19b-658977c2bbb5")
    public static final String HWMEMORY_LIFELINE_ADRESSSIZE_TAGTYPE = "HwMemory_Lifeline_adressSize";

    @objid ("f7e05d19-4309-4a55-81c9-52fd9e175b6d")
    public static final String HWMEMORY_LIFELINE_DESCRIPTION_TAGTYPE = "HwMemory_Lifeline_description";

    @objid ("56e31325-b609-4e74-8019-96506aa95f2f")
    public static final String HWMEMORY_LIFELINE_ENDPOINTS_TAGTYPE = "HwMemory_Lifeline_endPoints";

    @objid ("7f70cc58-46a0-4499-8d8d-f48e78e051aa")
    public static final String HWMEMORY_LIFELINE_FREQUENCY_TAGTYPE = "HwMemory_Lifeline_frequency";

    @objid ("6af199e7-0b64-466e-b5ca-f74b60dd9715")
    public static final String HWMEMORY_LIFELINE_MEMORYSIZE_TAGTYPE = "HwMemory_Lifeline_memorySize";

    @objid ("3b7942ad-e94d-414a-ad38-1105a2c2e508")
    public static final String HWMEMORY_LIFELINE_OWNEDHW_TAGTYPE = "HwMemory_Lifeline_ownedHW";

    @objid ("2cfddc3b-c7fa-47c3-8f35-1129c3cc1463")
    public static final String HWMEMORY_LIFELINE_P_HW_SERVICES_TAGTYPE = "HwMemory_Lifeline_p_HW_Services";

    @objid ("7663dd55-4f18-4c7a-8bbf-e1ca9547a514")
    public static final String HWMEMORY_LIFELINE_R_HW_SERVICES_TAGTYPE = "HwMemory_Lifeline_r_HW_Services";

    @objid ("8b8def41-c19b-48b9-87d3-32cc5a281b6f")
    public static final String HWMEMORY_LIFELINE_THROUGHPUT_TAGTYPE = "HwMemory_Lifeline_throughput";

    @objid ("8ca78d05-4463-4704-85dc-d807760dfc31")
    public static final String HWMEMORY_LIFELINE_TIMINGS_TAGTYPE = "HwMemory_Lifeline_timings";

    /**
     * Tells whether a {@link HwMemoryLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwMemory_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ba3288e6-df89-4f73-bca8-ff15ce237ed5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwMemory_Lifeline >> then instantiate a {@link HwMemoryLifeline} proxy.
     * 
     * @return a {@link HwMemoryLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("dcef17ee-8f1c-44dc-892f-ffee1dc5bbbb")
    public static HwMemoryLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryLifeline.STEREOTYPE_NAME);
        return HwMemoryLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwMemoryLifeline} proxy from a {@link Lifeline} stereotyped << HwMemory_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwMemoryLifeline} proxy or <i>null</i>.
     */
    @objid ("ded3dea5-200b-43f3-96e0-35482b9b9fab")
    public static HwMemoryLifeline instantiate(final Lifeline obj) {
        return HwMemoryLifeline.canInstantiate(obj) ? new HwMemoryLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMemoryLifeline} proxy from a {@link Lifeline} stereotyped << HwMemory_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwMemoryLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("919adee7-f775-421d-8853-03f5c5e11e45")
    public static HwMemoryLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwMemoryLifeline.canInstantiate(obj))
        	return new HwMemoryLifeline(obj);
        else
        	throw new IllegalArgumentException("HwMemoryLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2489be03-84a3-4a45-98a9-e339deb0945c")
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
        HwMemoryLifeline other = (HwMemoryLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("b7370acc-4bf4-4c48-8a71-c5ab5e7a5b66")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwMemory_Lifeline_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5161813c-7fbb-4cd8-942d-67407f3079fa")
    public String getHwMemory_Lifeline_adressSize() {
        return this.elt.getTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_ADRESSSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("731ef56d-4cae-4827-9b1a-07ed5daa9527")
    public String getHwMemory_Lifeline_description() {
        return this.elt.getTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Lifeline_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("69d1001a-aceb-4f68-adc4-cdc92b33a2bd")
    public List<String> getHwMemory_Lifeline_endPoints() {
        return this.elt.getTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e3c21fe4-4eec-4605-a286-d73e8f01a3d6")
    public String getHwMemory_Lifeline_frequency() {
        return this.elt.getTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Lifeline_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d09af71-938a-43e5-affb-2d52705d40c9")
    public String getHwMemory_Lifeline_memorySize() {
        return this.elt.getTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Lifeline_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6deeda4d-1dae-4091-b4e3-ef91500c64d1")
    public List<String> getHwMemory_Lifeline_ownedHW() {
        return this.elt.getTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Lifeline_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("495c1fb7-a383-4538-9fb5-9237b7db4a78")
    public List<String> getHwMemory_Lifeline_p_HW_Services() {
        return this.elt.getTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Lifeline_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1c167464-6f50-4314-8896-a07849d5d639")
    public List<String> getHwMemory_Lifeline_r_HW_Services() {
        return this.elt.getTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Lifeline_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("97ab5c96-de4c-4381-bdb2-98d581fe744b")
    public String getHwMemory_Lifeline_throughput() {
        return this.elt.getTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Lifeline_timings'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2cfa7a49-23de-40df-ada8-8d28ced5903b")
    public List<String> getHwMemory_Lifeline_timings() {
        return this.elt.getTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_TIMINGS_TAGTYPE_ELT);
    }

    @objid ("e07f5266-8339-4ac9-8b7a-c3dbb39620e1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwMemory_Lifeline_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba206b49-b3cc-42c3-9a39-df507b0ff05a")
    public void setHwMemory_Lifeline_adressSize(final String value) {
        this.elt.putTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_ADRESSSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("23ac7cf3-3b69-4dda-bfd5-7f6a90b9f453")
    public void setHwMemory_Lifeline_description(final String value) {
        this.elt.putTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Lifeline_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09a7c95e-8c7e-4923-aa85-65272b378249")
    public void setHwMemory_Lifeline_endPoints(final List<String> values) {
        this.elt.putTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("206132de-bcae-4020-9e03-f9f4c3cf19ae")
    public void setHwMemory_Lifeline_frequency(final String value) {
        this.elt.putTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Lifeline_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bfedf2ab-163b-41ad-95ec-057ae0d906bb")
    public void setHwMemory_Lifeline_memorySize(final String value) {
        this.elt.putTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Lifeline_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5e5b9e23-1e14-48c6-a4d6-34b1203801e3")
    public void setHwMemory_Lifeline_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Lifeline_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e8860470-4a91-4486-b109-502825a11320")
    public void setHwMemory_Lifeline_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Lifeline_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3d03ad2d-3b41-4805-8e5a-27edf5007863")
    public void setHwMemory_Lifeline_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Lifeline_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5e5a8103-339b-4ded-8575-ab1131b9c84d")
    public void setHwMemory_Lifeline_throughput(final String value) {
        this.elt.putTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Lifeline_timings'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a82f8d6e-d51e-4845-a06e-29db857900b7")
    public void setHwMemory_Lifeline_timings(final List<String> values) {
        this.elt.putTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_TIMINGS_TAGTYPE_ELT, values);
    }

    @objid ("400065a9-c9cb-42e4-a6fa-e1470b541943")
    protected HwMemoryLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("cfd7b41c-1e5c-424d-a07d-13190319f429")
    public static final class MdaTypes {
        @objid ("de30f077-d17b-4675-89a3-5140c1f5edfb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0f73dd9d-c424-4616-b1c7-d9a9536315e3")
        public static TagType HWMEMORY_LIFELINE_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("66f934bd-398c-491d-a7ff-08cf58c2785d")
        public static TagType HWMEMORY_LIFELINE_ADRESSSIZE_TAGTYPE_ELT;

        @objid ("a5e6fbdc-f376-4d5d-85d3-bb0f4f5bb139")
        public static TagType HWMEMORY_LIFELINE_TIMINGS_TAGTYPE_ELT;

        @objid ("d6bee9a4-f1f7-4f13-9f0c-72f3b26227c1")
        public static TagType HWMEMORY_LIFELINE_THROUGHPUT_TAGTYPE_ELT;

        @objid ("bf39909f-2119-41c6-8c97-9508b50dae60")
        public static TagType HWMEMORY_LIFELINE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("3effdc5d-0b14-4c1a-a635-f2dd83d18bfa")
        public static TagType HWMEMORY_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("e75599d7-1b40-450c-80d0-6a5a72bda378")
        public static TagType HWMEMORY_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("f6d46469-f727-4f4e-9ca3-886d837d5c15")
        public static TagType HWMEMORY_LIFELINE_OWNEDHW_TAGTYPE_ELT;

        @objid ("4f1744d0-4796-4c34-b58c-d8beab3a92e5")
        public static TagType HWMEMORY_LIFELINE_FREQUENCY_TAGTYPE_ELT;

        @objid ("848f50d9-1c64-4a2f-b554-cc882560c4fb")
        public static TagType HWMEMORY_LIFELINE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("7697db8f-30c2-44ba-b360-e36de45b8ad4")
        private static Stereotype MDAASSOCDEP;

        @objid ("b8a36d5f-79b8-4334-89bb-56214ce92f71")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("512f42b1-3717-4d6b-aa7a-571be34afec7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e6d65fc3-1004-11df-86fe-0014222a9f79");
            HWMEMORY_LIFELINE_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "04c2e8fc-1005-11df-86fe-0014222a9f79");
            HWMEMORY_LIFELINE_ADRESSSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "04c2e8fd-1005-11df-86fe-0014222a9f79");
            HWMEMORY_LIFELINE_TIMINGS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "04c2e8fe-1005-11df-86fe-0014222a9f79");
            HWMEMORY_LIFELINE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "04c2e8ff-1005-11df-86fe-0014222a9f79");
            HWMEMORY_LIFELINE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4d97ed6-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4d97ed7-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4d97ed8-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LIFELINE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4d97ed9-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LIFELINE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4d97eda-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LIFELINE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "08c7ef91-170f-11df-b92a-0014222a9f79");
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
