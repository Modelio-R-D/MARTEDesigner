/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link AssociationEnd} with << SwMutualExclusionResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9a5e5a45-8332-4f91-afbd-9ea95c04a7d1")
public class SwMutualExclusionResourceAssociationEnd extends SwSynchronizationResourceAssociationEnd {
    @objid ("41057e04-13e8-4e22-929d-8d181345b14a")
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_AssociationEnd";

    @objid ("be53d11d-52ee-481f-971b-8fd1666f1fd1")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_accessTokenElements";

    @objid ("76a30d2e-27d7-4830-bfff-0e0f85ae7d2b")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_acquireServices";

    @objid ("3ca9bfe1-deac-457b-b155-cdbbdd584503")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_ceiling";

    @objid ("8e36b56d-6a06-4724-a75e-67c77636b65d")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol";

    @objid ("80c99aeb-4fe7-4beb-b378-f3e82f7c7bf0")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_mechanism";

    @objid ("e2aa84ba-351a-4e7d-abc5-19f0ed6328f1")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_otherProtectProtocol";

    @objid ("42245cc2-7a86-4372-88f9-7b1e45eb80ba")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_protectKind";

    @objid ("eb2ebf55-6ac4-4e6e-9122-81325a29afaa")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_releaseServices";

    @objid ("fc1345fc-c821-4943-9b69-246bb7196a2e")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwMutualExclusionResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("50631dbc-019a-4a0e-88e1-f6db560294fd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwMutualExclusionResource_AssociationEnd >> then instantiate a {@link SwMutualExclusionResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("7381c276-4494-4feb-b9b0-93538bcabfdb")
    public static SwMutualExclusionResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAssociationEnd.STEREOTYPE_NAME);
        return SwMutualExclusionResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwMutualExclusionResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwMutualExclusionResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("ac23acc9-e8d5-41db-a2b4-d67e7372ad44")
    public static SwMutualExclusionResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SwMutualExclusionResourceAssociationEnd.canInstantiate(obj) ? new SwMutualExclusionResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwMutualExclusionResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SwMutualExclusionResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e82cd489-e9e6-49f4-a64d-f1ae5bc5809a")
    public static SwMutualExclusionResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceAssociationEnd.canInstantiate(obj))
        	return new SwMutualExclusionResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1cd383f7-0d23-4a09-b9d7-1b2993f87297")
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
        SwMutualExclusionResourceAssociationEnd other = (SwMutualExclusionResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("5cf51029-2317-4449-b419-f2998c2a772e")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_AssociationEnd_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0abdbe4e-de23-48fd-8f0a-3f1989bec782")
    public List<String> getSwMutualExclusionResource_AssociationEnd_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_AssociationEnd_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8c3459e6-680f-4fa4-b909-d704f530c27d")
    public List<String> getSwMutualExclusionResource_AssociationEnd_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72e20cb4-7ee1-4c16-a424-8e246584ef5b")
    public String getSwMutualExclusionResource_AssociationEnd_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94527181-439a-457b-9eb5-19afc767ecfd")
    public String getSwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4ce5d30b-d404-44f8-80ad-08c85266cbea")
    public String getSwMutualExclusionResource_AssociationEnd_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d1b968d-c231-4bd6-9c9f-075cb6c55ba3")
    public String getSwMutualExclusionResource_AssociationEnd_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("697af168-3faa-47c7-99bb-bc5cd29d3652")
    public String getSwMutualExclusionResource_AssociationEnd_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_AssociationEnd_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("58c219d7-20f9-4e48-aaf0-8efd9930a645")
    public List<String> getSwMutualExclusionResource_AssociationEnd_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc1fd02e-7596-46db-9896-fc5d768f4b54")
    public String getSwMutualExclusionResource_AssociationEnd_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("c8a33df8-6389-4978-b62d-cf7b8eb83f77")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_AssociationEnd_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("391b6d8c-79a0-4cc0-8688-d9ba92b5dc71")
    public void setSwMutualExclusionResource_AssociationEnd_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_AssociationEnd_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("41797ea5-de88-408a-9ebf-c04ded68cb97")
    public void setSwMutualExclusionResource_AssociationEnd_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a261afcb-add8-45ee-9a39-d3a12efe0e38")
    public void setSwMutualExclusionResource_AssociationEnd_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bbf698f2-6a81-4033-87eb-a75eb82b0395")
    public void setSwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2eb917e9-2be9-4d39-a994-18a295868b41")
    public void setSwMutualExclusionResource_AssociationEnd_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a928628-4421-48bf-ae2b-a90dc2050899")
    public void setSwMutualExclusionResource_AssociationEnd_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c4af5f5c-92ab-43f5-b794-8bd9a5f3e2e7")
    public void setSwMutualExclusionResource_AssociationEnd_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_AssociationEnd_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("86c20106-5ce8-481f-985d-d72fb7f172f2")
    public void setSwMutualExclusionResource_AssociationEnd_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dab0b636-383a-4572-b5fe-1d77bcf9774d")
    public void setSwMutualExclusionResource_AssociationEnd_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("79266dc0-312b-4ff6-9be8-f20ba037f1f9")
    protected SwMutualExclusionResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("c04394ca-c420-43d7-9a78-5fecc2aede4d")
    public static final class MdaTypes {
        @objid ("a4588435-73b3-40f2-a384-465aec0e1166")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9624e200-331a-401f-99d3-8604991e0f94")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT;

        @objid ("5351cf74-427a-401d-9d81-e4f30a038952")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        @objid ("36e702af-8fe5-4f6e-8ac7-8e4dce9518f0")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        @objid ("3b16d76f-c142-4b86-9c5a-950f551347a4")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE_ELT;

        @objid ("faacb6a5-0539-47b1-b59b-2a88544b2df8")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE_ELT;

        @objid ("7532bb56-5d08-4c9b-8174-e1bc3f9c725d")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT;

        @objid ("a90eb52f-3c06-492c-a1b7-5ff2c21e4f2a")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT;

        @objid ("1cd7db0e-5de8-43d5-8898-d921c8e264fa")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("d0164670-17fe-4dd1-bd3e-9cd31db2e574")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT;

        @objid ("4f40c05e-99ff-4bdd-b2f5-8799e823bf8a")
        private static Stereotype MDAASSOCDEP;

        @objid ("aaa15bd9-79e3-42e2-aeb6-c65ef56beb80")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("324fe8e5-c374-4181-9ad2-3bb36de8ca7c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02407f80-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454425-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245442c-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454433-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245443a-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454441-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "deff4e19-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "deff4e1a-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "deff4e1b-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "deff4e1c-92ad-11e0-a69d-0027103f347c");
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
