/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.CommunicationEndPointAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwEndPoint_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("66514926-27ab-49ed-8aad-2c5fb0f4d279")
public class HwEndPointAssociationEnd extends CommunicationEndPointAssociationEnd {
    @objid ("ed9a388e-5c15-48cd-a552-c9cd8df17aa1")
    public static final String STEREOTYPE_NAME = "HwEndPoint_AssociationEnd";

    @objid ("135a9c6a-0bac-4c19-a50b-83ee6588b0a4")
    public static final String HWENDPOINT_ASSOCIATIONEND_CONNECTEDTO_TAGTYPE = "HwEndPoint_AssociationEnd_connectedTo";

    @objid ("57d3f9a4-1974-415e-b9dd-3011b0cb24e0")
    public static final String HWENDPOINT_ASSOCIATIONEND_DESCRIPTION_TAGTYPE = "HwEndPoint_AssociationEnd_description";

    @objid ("c2d1338d-546d-4f53-a7d6-20598f315a3e")
    public static final String HWENDPOINT_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwEndPoint_AssociationEnd_frequency";

    @objid ("0e883457-b138-48b2-a0b2-c40186969e09")
    public static final String HWENDPOINT_ASSOCIATIONEND_OWNEDHW_TAGTYPE = "HwEndPoint_AssociationEnd_ownedHW";

    @objid ("2f82507c-be60-40f0-b558-3c0fbbf421dc")
    public static final String HWENDPOINT_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE = "HwEndPoint_AssociationEnd_p_HW_Services";

    @objid ("df6b80ad-7acd-48c8-b2db-0ebe49da4c25")
    public static final String HWENDPOINT_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE = "HwEndPoint_AssociationEnd_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwEndPoint_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a2b739fe-5a4b-4c16-89ef-5b391cca1f44")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwEndPoint_AssociationEnd >> then instantiate a {@link HwEndPointAssociationEnd} proxy.
     * 
     * @return a {@link HwEndPointAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("6df8e83f-50a2-418e-a5ff-3921427f3b28")
    public static HwEndPointAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAssociationEnd.STEREOTYPE_NAME);
        return HwEndPointAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwEndPoint_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwEndPointAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("7775aced-88a0-44b1-a960-f4ffa4e16677")
    public static HwEndPointAssociationEnd instantiate(final AssociationEnd obj) {
        return HwEndPointAssociationEnd.canInstantiate(obj) ? new HwEndPointAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwEndPoint_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwEndPointAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3d6d702f-18fb-4955-865c-d393884d5ddc")
    public static HwEndPointAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwEndPointAssociationEnd.canInstantiate(obj))
        	return new HwEndPointAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwEndPointAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7bc1f7dc-9c5b-4bc9-a892-af8f5cce4101")
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
        HwEndPointAssociationEnd other = (HwEndPointAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("3b023883-0c8f-481f-a339-0ec2504e989c")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_AssociationEnd_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3f70f971-aefc-4403-b340-80cb886688a0")
    public List<String> getHwEndPoint_AssociationEnd_connectedTo() {
        return this.elt.getTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34e05ff8-a327-4249-803e-edd508ff8af4")
    public String getHwEndPoint_AssociationEnd_description() {
        return this.elt.getTagValue(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c1734bde-3009-4e39-85a5-475c2c206199")
    public String getHwEndPoint_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_AssociationEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0b975466-407a-46d4-a361-07255cb4ac2f")
    public List<String> getHwEndPoint_AssociationEnd_ownedHW() {
        return this.elt.getTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_AssociationEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("01fe6a48-425f-4a9a-804a-3cea935ca5ce")
    public List<String> getHwEndPoint_AssociationEnd_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_AssociationEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("caf7abd1-c79d-45dd-a5a9-7869c27d4c1e")
    public List<String> getHwEndPoint_AssociationEnd_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("69440222-68e8-4be9-b4b0-d3977d32d6d8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_AssociationEnd_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("408cde50-a45d-496c-9e16-a6bea992d1c1")
    public void setHwEndPoint_AssociationEnd_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fffa5ef3-13d5-4696-9bf7-c1a22dc407df")
    public void setHwEndPoint_AssociationEnd_description(final String value) {
        this.elt.putTagValue(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d16914b5-801d-43e3-a0ca-4f53ca1faf39")
    public void setHwEndPoint_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_AssociationEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c4855d2a-0a04-4441-9660-7a62f798a5cc")
    public void setHwEndPoint_AssociationEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_AssociationEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("10b8c61e-e246-433a-9a13-8647a08b467e")
    public void setHwEndPoint_AssociationEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_AssociationEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b5e246bc-de24-483e-83b8-787e2244dc01")
    public void setHwEndPoint_AssociationEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("552cc4c3-efb3-42f0-9a33-3f33f087265c")
    protected HwEndPointAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("9b7a0c35-98cb-49ee-b311-c6f68927c683")
    public static final class MdaTypes {
        @objid ("01982032-9206-4536-979a-5c628b6e0ff2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("24eb1505-6418-435d-834d-a95a5674968c")
        public static TagType HWENDPOINT_ASSOCIATIONEND_CONNECTEDTO_TAGTYPE_ELT;

        @objid ("b450a384-5c5b-4e5b-8d91-d6b2dfe30a8a")
        public static TagType HWENDPOINT_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT;

        @objid ("b05cb504-fecf-4e95-9954-f3234a7186fa")
        public static TagType HWENDPOINT_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("d237f138-63a9-4ec8-a7fc-2b014ce51ab3")
        public static TagType HWENDPOINT_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("cdbf5b6c-9460-4539-b112-3ac2e0ba0e88")
        public static TagType HWENDPOINT_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT;

        @objid ("7fd7176b-a784-4331-8112-abe901ed9f58")
        public static TagType HWENDPOINT_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        @objid ("6d370eab-1cb0-48a2-9ce0-798887dfc518")
        private static Stereotype MDAASSOCDEP;

        @objid ("62517164-6357-4ca0-b273-a70e9ecd136b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4e65371f-20b9-429f-876d-88c535852557")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "010cf42e-0ccf-11df-8525-001302895b2b");
            HWENDPOINT_ASSOCIATIONEND_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "010f5681-0ccf-11df-8525-001302895b2b");
            HWENDPOINT_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "49b6c443-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "49b6eb54-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "49b6eb55-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "49b6eb56-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "49b6eb57-92a9-11e0-a69d-0027103f347c");
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
