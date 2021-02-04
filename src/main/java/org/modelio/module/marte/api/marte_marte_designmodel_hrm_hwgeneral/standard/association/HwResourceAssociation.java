/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("205c663f-2886-43d9-8697-d6b08c7d10a5")
public class HwResourceAssociation extends ResourceAssociation {
    @objid ("892f905d-864e-4865-88ed-0c7497a74d7c")
    public static final String STEREOTYPE_NAME = "HwResource_Association";

    @objid ("da88303d-d42a-4966-a11a-ac362f464de5")
    public static final String HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwResource_Association_description";

    @objid ("226176f1-baf6-481f-827c-4d0ddb5a400c")
    public static final String HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE = "HwResource_Association_endPoints";

    @objid ("cbdbaa77-953b-485d-a95f-bed1aab6fc40")
    public static final String HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE = "HwResource_Association_frequency";

    @objid ("3cdac7a5-58fa-48b2-ae44-f8907e452c33")
    public static final String HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE = "HwResource_Association_ownedHW";

    @objid ("2305086a-0ce9-46f4-9b1b-faf4d27a5454")
    public static final String HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwResource_Association_p_HW_Services";

    @objid ("ff1e8d2c-9ef1-491e-9a72-cac83709fbc4")
    public static final String HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwResource_Association_r_HW_Services";

    /**
     * Tells whether a {@link HwResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4198871f-3535-46e9-9344-a4b3d8617a03")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwResource_Association >> then instantiate a {@link HwResourceAssociation} proxy.
     * 
     * @return a {@link HwResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("3cb807fe-173c-4d2a-a3f7-940998d363af")
    public static HwResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceAssociation.STEREOTYPE_NAME);
        return HwResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceAssociation} proxy from a {@link Association} stereotyped << HwResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("8ebe6c9c-a31e-4466-bcbf-09404dd45814")
    public static HwResourceAssociation instantiate(final Association obj) {
        return HwResourceAssociation.canInstantiate(obj) ? new HwResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceAssociation} proxy from a {@link Association} stereotyped << HwResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("874e203d-0a5a-4d6a-8009-8321a242db40")
    public static HwResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwResourceAssociation.canInstantiate(obj))
        	return new HwResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("HwResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a1b17546-b446-4cf8-a251-357f11088d7d")
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
        HwResourceAssociation other = (HwResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("9db73901-4a75-454c-9fcf-45d9d5e70f61")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a62847c8-e70e-419e-88d1-92db3d98fe78")
    public String getHwResource_Association_description() {
        return this.elt.getTagValue(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Association_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("65193764-be55-446a-a12d-3ba80cf8def5")
    public List<String> getHwResource_Association_endPoints() {
        return this.elt.getTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f97e6e7-de28-451d-a5fc-bfb0c369158d")
    public String getHwResource_Association_frequency() {
        return this.elt.getTagValue(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("34b6a24b-00aa-4880-93e0-880a82990695")
    public List<String> getHwResource_Association_ownedHW() {
        return this.elt.getTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1d304dfc-22b9-480d-bcf0-961ed9aea6da")
    public List<String> getHwResource_Association_p_HW_Services() {
        return this.elt.getTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dd9ef7b0-ab19-4ae0-958d-052c04350c25")
    public List<String> getHwResource_Association_r_HW_Services() {
        return this.elt.getTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("d9dc6836-3abf-40b0-a866-1421f7af2666")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0aa84c48-f23b-4bbf-904b-24cad8f418a2")
    public void setHwResource_Association_description(final String value) {
        this.elt.putTagValue(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Association_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba61a4ec-e3e5-4289-b19c-0d1389f0e30c")
    public void setHwResource_Association_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e435f9bc-aee8-4dd0-963e-060722f7376c")
    public void setHwResource_Association_frequency(final String value) {
        this.elt.putTagValue(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("527f2bbf-21d2-4687-8da9-9f57904cdf08")
    public void setHwResource_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("22cdfcdc-1499-4003-9fd7-db5c663210db")
    public void setHwResource_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fb11dd82-8cf9-441a-aff9-f3f8f66c100c")
    public void setHwResource_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("ec04bd22-c704-4cf6-9c85-c4df17de344c")
    protected HwResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("5189b4a1-210b-458b-a0e8-ef90240f1909")
    public static final class MdaTypes {
        @objid ("1b5c6b8e-8bad-466f-8c18-e151b2a82b6d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("df6c7aa8-1a0a-4de2-b413-f2140e9c6922")
        public static TagType HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        @objid ("893a271a-418c-456c-be69-90d6a590897c")
        public static TagType HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("cde108bd-b50e-4782-aa8d-0f0ce6e15e85")
        public static TagType HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("f048590f-1de5-4b71-901c-0d7a37de36ee")
        public static TagType HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        @objid ("43bc2ca1-5330-4f53-af7e-f060dae56a0e")
        public static TagType HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        @objid ("d9b9b509-3396-42ba-ac85-a49c79742a32")
        public static TagType HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT;

        @objid ("ac285c5c-1e25-4058-a5af-bbabbd4de427")
        private static Stereotype MDAASSOCDEP;

        @objid ("81e91e07-b93e-4878-8b44-b9d1395c54eb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6af2af29-9143-481c-86cd-3ad249968dbf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "495b5f8b-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "70448062-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "70448063-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "70448064-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7044805f-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "70448061-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3186f94b-1709-11df-b92a-0014222a9f79");
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
