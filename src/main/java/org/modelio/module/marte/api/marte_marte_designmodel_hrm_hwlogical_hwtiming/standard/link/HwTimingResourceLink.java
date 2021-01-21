/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.TimingResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwTimingResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f0809f2a-2624-4444-9816-755470d852dd")
public class HwTimingResourceLink extends TimingResourceLink {
    @objid ("80e5b979-4fd7-42d5-b248-9879ce2671d3")
    public static final String STEREOTYPE_NAME = "HwTimingResource_Link";

    @objid ("6aa07c38-d597-4265-bc22-bd1d5a7834ca")
    public static final String HWTIMINGRESOURCE_LINK_DESCRIPTION_TAGTYPE = "HwTimingResource_Link_description";

    @objid ("9fb3c365-3ad8-4bfc-8b84-774fc1a3de67")
    public static final String HWTIMINGRESOURCE_LINK_ENDPOINTS_TAGTYPE = "HwTimingResource_Link_endPoints";

    @objid ("d2c175c7-5cde-42d7-b6d9-98d5c594f745")
    public static final String HWTIMINGRESOURCE_LINK_FREQUENCY_TAGTYPE = "HwTimingResource_Link_frequency";

    @objid ("42583fbb-5836-42a0-88d4-d894146c1f24")
    public static final String HWTIMINGRESOURCE_LINK_OWNEDHW_TAGTYPE = "HwTimingResource_Link_ownedHW";

    @objid ("351641fa-5b93-4f40-b392-ec118c067091")
    public static final String HWTIMINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Link_p_HW_Services";

    @objid ("83a62477-f07e-4d25-9406-36b27255c465")
    public static final String HWTIMINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Link_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwTimingResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7e64ee39-eb7b-443e-a7a6-0218e84e161a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwTimingResource_Link >> then instantiate a {@link HwTimingResourceLink} proxy.
     * 
     * @return a {@link HwTimingResourceLink} proxy on the created {@link Link}.
     */
    @objid ("df5fc5d0-1d98-4a47-b405-71129d3d3111")
    public static HwTimingResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceLink.STEREOTYPE_NAME);
        return HwTimingResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceLink} proxy from a {@link Link} stereotyped << HwTimingResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwTimingResourceLink} proxy or <i>null</i>.
     */
    @objid ("5f1412ef-85c3-4d1a-af0b-7445a444b473")
    public static HwTimingResourceLink instantiate(final Link obj) {
        return HwTimingResourceLink.canInstantiate(obj) ? new HwTimingResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceLink} proxy from a {@link Link} stereotyped << HwTimingResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwTimingResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("21f75e97-b342-46b4-ad57-b81f4d28240c")
    public static HwTimingResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwTimingResourceLink.canInstantiate(obj))
        	return new HwTimingResourceLink(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1deef6eb-888a-47fc-9a72-e762bb3b3d22")
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
        HwTimingResourceLink other = (HwTimingResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("1ecc4398-0d86-4e09-b7a3-2c3034075e4f")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69caf118-50eb-4a05-87c2-993ce256f963")
    public String getHwTimingResource_Link_description() {
        return this.elt.getTagValue(HwTimingResourceLink.MdaTypes.HWTIMINGRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Link_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e6b52bec-9ba0-4b7f-8b9f-332acdf6f950")
    public List<String> getHwTimingResource_Link_endPoints() {
        return this.elt.getTagValues(HwTimingResourceLink.MdaTypes.HWTIMINGRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("598329a9-58ab-4f0b-adaa-bc8165a0ee2c")
    public String getHwTimingResource_Link_frequency() {
        return this.elt.getTagValue(HwTimingResourceLink.MdaTypes.HWTIMINGRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Link_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("52dbea1d-ea35-43d7-afcd-8202099fb5e3")
    public List<String> getHwTimingResource_Link_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceLink.MdaTypes.HWTIMINGRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Link_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("18688e0b-5913-47ac-91b4-63279d9afe0e")
    public List<String> getHwTimingResource_Link_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceLink.MdaTypes.HWTIMINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Link_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("72666487-8699-4333-9947-466c1a51d9f2")
    public List<String> getHwTimingResource_Link_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceLink.MdaTypes.HWTIMINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("f815ff80-f46e-4299-915c-a596de85805f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("411b969e-a89e-40d7-8d61-e12b3c2be738")
    public void setHwTimingResource_Link_description(final String value) {
        this.elt.putTagValue(HwTimingResourceLink.MdaTypes.HWTIMINGRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Link_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e59b7f06-c618-4e97-915a-d3edcc98d74b")
    public void setHwTimingResource_Link_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceLink.MdaTypes.HWTIMINGRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("840d213f-bc39-4044-8c8a-1936bac688b4")
    public void setHwTimingResource_Link_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceLink.MdaTypes.HWTIMINGRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Link_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("feff6ff1-9892-4828-9a48-364cc7be475a")
    public void setHwTimingResource_Link_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceLink.MdaTypes.HWTIMINGRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Link_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("089bbd17-2947-4e2b-82fe-486e9bef9419")
    public void setHwTimingResource_Link_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceLink.MdaTypes.HWTIMINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Link_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f32fb291-db5d-4293-9ab6-6d3a7e9e6023")
    public void setHwTimingResource_Link_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceLink.MdaTypes.HWTIMINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("53da7a12-8e22-4a6a-bb48-2bb4ef307a6b")
    protected HwTimingResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("69e44479-c37b-478a-afea-3691e366bc7d")
    public static final class MdaTypes {
        @objid ("639f7420-3856-476e-9630-b349a5427a89")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f7cced71-aa62-41bb-b81c-aaeaf556b9a8")
        public static TagType HWTIMINGRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT;

        @objid ("348dde03-0f96-48c7-9450-9daa4b81d063")
        public static TagType HWTIMINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("c8161956-88c2-4cde-89e5-1ec715df23db")
        public static TagType HWTIMINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("123032e9-ad58-45f3-bc36-8d8369b3323f")
        public static TagType HWTIMINGRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT;

        @objid ("8ed104b3-ab18-48c7-baea-85f980662aa6")
        public static TagType HWTIMINGRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT;

        @objid ("a1a98481-17f3-4da4-90b2-5ea2a0a08e12")
        public static TagType HWTIMINGRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT;

        @objid ("14d75d56-ec72-4187-8157-4b0601e9ec9b")
        private static Stereotype MDAASSOCDEP;

        @objid ("7089d1bc-982e-4417-85a8-c27201ce1fa0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6251a59d-d639-4fac-93bc-51747206f49f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01226915-0ccf-11df-8525-001302895b2b");
            HWTIMINGRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "451eee3c-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "451eee3d-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "451eee3e-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "451eee3f-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bb08e511-1709-11df-b92a-0014222a9f79");
            HWTIMINGRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6f807bd9-8dfb-11e0-8741-0027103f347c");
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
