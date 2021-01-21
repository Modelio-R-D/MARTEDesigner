/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.TimingResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwTimingResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4fc78816-fa33-4d32-b1a1-6ed58226f29c")
public class HwTimingResourceParameter extends TimingResourceParameter {
    @objid ("f141ca55-c000-4347-bc33-ef3b50ff134c")
    public static final String STEREOTYPE_NAME = "HwTimingResource_Parameter";

    @objid ("f2d77222-db12-4c89-915e-8137404f990c")
    public static final String HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE = "HwTimingResource_Parameter_description";

    @objid ("47e92c18-3d81-4f8d-818d-5367234a9cf2")
    public static final String HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE = "HwTimingResource_Parameter_endPoints";

    @objid ("78d49e1a-eb59-4f76-9766-5a0c019460ce")
    public static final String HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE = "HwTimingResource_Parameter_frequency";

    @objid ("6ad79023-b3a3-4bfa-aaa2-e6ba6e539246")
    public static final String HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE = "HwTimingResource_Parameter_ownedHW";

    @objid ("5d452ae7-435a-4d7c-a188-fb7c51cbd143")
    public static final String HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Parameter_p_HW_Services";

    @objid ("95a99ec6-7208-4111-b318-622653143df5")
    public static final String HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Parameter_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwTimingResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3502ecf9-f984-4eec-bc28-a156cbbc0f1f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwTimingResource_Parameter >> then instantiate a {@link HwTimingResourceParameter} proxy.
     * 
     * @return a {@link HwTimingResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("2eda172a-8886-4331-a9da-ea9cc928dfc0")
    public static HwTimingResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceParameter.STEREOTYPE_NAME);
        return HwTimingResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceParameter} proxy from a {@link Parameter} stereotyped << HwTimingResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwTimingResourceParameter} proxy or <i>null</i>.
     */
    @objid ("eb33701d-6bcd-4bfc-8101-bed978639de0")
    public static HwTimingResourceParameter instantiate(final Parameter obj) {
        return HwTimingResourceParameter.canInstantiate(obj) ? new HwTimingResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceParameter} proxy from a {@link Parameter} stereotyped << HwTimingResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwTimingResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("eb5fde82-559a-4be2-a2a7-d0925f2a005b")
    public static HwTimingResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwTimingResourceParameter.canInstantiate(obj))
        	return new HwTimingResourceParameter(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e96fb3c1-4c52-4509-888a-4f13ab9d52fd")
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
        HwTimingResourceParameter other = (HwTimingResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("1dd14769-0968-4167-9746-9f1339ad6e8d")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4c493e3d-8ebe-4d2a-8001-e04745d68bd6")
    public String getHwTimingResource_Parameter_description() {
        return this.elt.getTagValue(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Parameter_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("17577e2e-1e5b-4bfc-a480-30ea22172c08")
    public List<String> getHwTimingResource_Parameter_endPoints() {
        return this.elt.getTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2bc44816-5c75-4e88-a0f1-d891e6f747c9")
    public String getHwTimingResource_Parameter_frequency() {
        return this.elt.getTagValue(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Parameter_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e23fa4ab-0e1a-4530-8f61-7655eb49b860")
    public List<String> getHwTimingResource_Parameter_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Parameter_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f22bb9d4-71d8-4661-adde-61b4589f293a")
    public List<String> getHwTimingResource_Parameter_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Parameter_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("51c43e90-ba24-48b9-9650-22fdac6aa7b6")
    public List<String> getHwTimingResource_Parameter_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("86fc7b67-3140-482f-8a0e-898b49a20f80")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b767324-8f35-46e8-905b-e8932ae889ce")
    public void setHwTimingResource_Parameter_description(final String value) {
        this.elt.putTagValue(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Parameter_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2f707566-0498-4692-af9c-80cc0152d5ce")
    public void setHwTimingResource_Parameter_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ab8baad-ae20-411f-9232-55854afad1fc")
    public void setHwTimingResource_Parameter_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Parameter_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4694fb51-5596-42e3-8f53-391e1edc3223")
    public void setHwTimingResource_Parameter_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Parameter_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("803ece2a-7944-46cd-83ec-cb66af127d84")
    public void setHwTimingResource_Parameter_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Parameter_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("88ec6fcb-cc5e-4e8d-ad50-0f35098d0dfc")
    public void setHwTimingResource_Parameter_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("1678a9fc-d590-4020-997c-abd8c3cbf592")
    protected HwTimingResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("429927ba-d276-45ce-91e0-da4a4c21192e")
    public static final class MdaTypes {
        @objid ("8f3df2cf-0cfc-4491-9a88-34ce0e75ec76")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f8e8dc39-a554-4b4a-a01c-dc12dfff1bbe")
        public static TagType HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("2237b9d1-748b-4736-a5cd-748c4a435ab1")
        public static TagType HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("3a64d085-706a-4bbc-8c3f-b477af2d0f5b")
        public static TagType HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("eed66466-ee0a-4950-9e4c-a44ee5230d4a")
        public static TagType HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT;

        @objid ("eb8eb7c4-97c0-4afb-9971-95e1ef9d8f8d")
        public static TagType HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("a920e159-be77-42c9-a3c5-46becb48f2ff")
        public static TagType HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT;

        @objid ("12bf9932-8657-44ef-a278-c02f9f557a08")
        private static Stereotype MDAASSOCDEP;

        @objid ("c78173b9-6631-4fa5-8dd0-d5dca441aabf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("36ab4ee6-af91-4ba4-bc06-200e2964ea47")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01226910-0ccf-11df-8525-001302895b2b");
            HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "43f28866-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "43f28867-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "43f28868-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "43f28869-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b9e86900-1709-11df-b92a-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "703fd91f-8dfb-11e0-8741-0027103f347c");
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
