/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SwCommunicationResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4449d223-6713-497a-8889-7eaa99f85232")
public class SwCommunicationResourceAssociationEnd extends SwInteractionResourceAssociationEnd {
    @objid ("3e55f0b8-b882-4695-94be-d984ace674a7")
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_AssociationEnd";

    @objid ("fbbec644-0823-41b2-b22a-0e43d44ef380")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_BLOCKT_TAGTYPE = "SwCommunicationResource_AssociationEnd_blockT";

    @objid ("e0654941-52b0-439d-8fdf-ba7c589a5af2")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE = "SwCommunicationResource_AssociationEnd_capacity";

    @objid ("fd646b34-29c8-44cf-b672-d084031a406c")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_AssociationEnd_elementSize";

    @objid ("e121c945-1c6b-43c1-ae55-46ce64badc1c")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_AssociationEnd_mainScheduler";

    @objid ("377463ed-86bf-4893-8031-a69fa5108162")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_PACKETT_TAGTYPE = "SwCommunicationResource_AssociationEnd_packetT";

    @objid ("d0225677-02c4-437c-b5b6-15c9d1580715")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_AssociationEnd_speedFactor";

    @objid ("7d6b7a69-639a-4de6-a6a0-fcb8b3d98d07")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_TRANSMMODE_TAGTYPE = "SwCommunicationResource_AssociationEnd_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwCommunicationResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d9ca14ec-99a8-4d7f-90c4-9dd56d2dee12")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwCommunicationResource_AssociationEnd >> then instantiate a {@link SwCommunicationResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwCommunicationResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("59e439c9-fac6-482c-a5ed-1674d2ac0980")
    public static SwCommunicationResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAssociationEnd.STEREOTYPE_NAME);
        return SwCommunicationResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwCommunicationResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwCommunicationResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("d3c682d5-fa5f-425d-b7a6-cfa302594f43")
    public static SwCommunicationResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SwCommunicationResourceAssociationEnd.canInstantiate(obj) ? new SwCommunicationResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwCommunicationResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SwCommunicationResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("db430650-5b9a-482c-b326-67bfa7f314ce")
    public static SwCommunicationResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwCommunicationResourceAssociationEnd.canInstantiate(obj))
        	return new SwCommunicationResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ccd126a1-b396-49ef-971c-d9b6041971f4")
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
        SwCommunicationResourceAssociationEnd other = (SwCommunicationResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("57498e81-f5bd-4f74-bdbe-8cba83b0ea08")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_AssociationEnd_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5e9e4bb8-4ef3-4e47-9191-f8018ed488a0")
    public List<String> getSwCommunicationResource_AssociationEnd_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_AssociationEnd_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ee4596aa-fb88-4910-af16-2f4c2b9a6960")
    public List<String> getSwCommunicationResource_AssociationEnd_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7af192f-a8a6-4abb-819b-09452bdc421c")
    public String getSwCommunicationResource_AssociationEnd_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_AssociationEnd_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("35ff323c-70c3-4d9c-9e96-f9a833387b6b")
    public String getSwCommunicationResource_AssociationEnd_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_AssociationEnd_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("65a770db-1ded-4ac3-85e3-4724c74d7db1")
    public List<String> getSwCommunicationResource_AssociationEnd_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_AssociationEnd_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c70f7021-4547-4c81-ad80-91c26237bbdd")
    public String getSwCommunicationResource_AssociationEnd_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_AssociationEnd_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("179f5add-dfd5-4f8c-a9bc-c6728330eafb")
    public String getSwCommunicationResource_AssociationEnd_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT);
    }

    @objid ("256e26a0-1ad1-4fb9-bc84-4632d67f99f0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_AssociationEnd_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("239c6061-9b23-441e-9ef1-61f5d06c4567")
    public void setSwCommunicationResource_AssociationEnd_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("925c7f93-e17e-48ab-bd04-e9e082f0bb81")
    public void setSwCommunicationResource_AssociationEnd_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6821066-475b-42ae-a4b6-6a90ffc073ef")
    public void setSwCommunicationResource_AssociationEnd_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_AssociationEnd_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d5251ac-5cca-418c-93b9-887847bf4f66")
    public void setSwCommunicationResource_AssociationEnd_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_AssociationEnd_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e28931e-db16-4e03-bda6-cc871cdb7ff8")
    public void setSwCommunicationResource_AssociationEnd_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_AssociationEnd_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("82a06d2f-4a55-47ec-9107-fa8a18609591")
    public void setSwCommunicationResource_AssociationEnd_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_AssociationEnd_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("89918312-901e-4df6-a9a5-3cddb7aad9ea")
    public void setSwCommunicationResource_AssociationEnd_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociationEnd.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("48b5e9a0-085e-4c3a-b6d0-e4cecfaf9cb0")
    protected SwCommunicationResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("8c45aa83-1c88-4383-bb6b-08b21cce3a77")
    public static final class MdaTypes {
        @objid ("cd2221f0-82cd-438d-b335-ff4a9bb98768")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cff5f8e1-c295-4fe8-b2a4-ba63f3b9e90a")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT;

        @objid ("1cb9d813-0a93-4425-ad68-50e8a08c01e7")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT;

        @objid ("98f3e18d-b573-4106-8ee7-dbd9e966fa83")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT;

        @objid ("2227dc02-19be-4215-90f3-a10ee100119d")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("d8557f1f-cd74-48e1-9104-0c04a6ffc046")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("1e9f892d-f890-4bd6-bdb4-026cfb10c69a")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("684ddeb3-06fa-49b3-a2d1-8dcab7d43fbf")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT;

        @objid ("d6437b62-d40b-4594-afe6-510f7cbcc207")
        private static Stereotype MDAASSOCDEP;

        @objid ("3679b55b-0640-47d2-be41-cafbe65924eb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("30ee3526-560e-4bb4-b48c-2001c882fc2a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0210d119-0ccf-11df-8525-001302895b2b");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84482869-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84482868-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84482867-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84482866-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84482865-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8978cb43-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "98bed97a-60ca-11e3-a828-0027103f347d");
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
