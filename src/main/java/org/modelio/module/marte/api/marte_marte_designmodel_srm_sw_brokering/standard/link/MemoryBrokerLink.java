/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.link;

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
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.link.SwResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << MemoryBroker_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("bc7cb465-f874-4467-8138-fe188001d0c3")
public class MemoryBrokerLink extends SwResourceLink {
    @objid ("22916e5a-6b7c-4242-b712-9b9e1c3bd3c6")
    public static final String STEREOTYPE_NAME = "MemoryBroker_Link";

    @objid ("94470d09-c573-42dd-9cb9-0834adb37339")
    public static final String MEMORYBROKER_LINK_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Link_accessPolicy";

    @objid ("f5a497e4-14e3-459d-af7a-f76a9af1522e")
    public static final String MEMORYBROKER_LINK_LOCKSERVICES_TAGTYPE = "MemoryBroker_Link_lockServices";

    @objid ("8e62165f-6c4b-4e82-98f1-0c43d594bd88")
    public static final String MEMORYBROKER_LINK_MAPSERVICES_TAGTYPE = "MemoryBroker_Link_mapServices";

    @objid ("c76782a5-22a4-447d-a658-f23e795d00fa")
    public static final String MEMORYBROKER_LINK_MEMORIES_TAGTYPE = "MemoryBroker_Link_memories";

    @objid ("b52b56a6-8cc2-4474-bd82-7dcce110b776")
    public static final String MEMORYBROKER_LINK_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Link_memoryBlockAdressElements";

    @objid ("a41c937c-fd63-4b87-8b28-947b6fa33c40")
    public static final String MEMORYBROKER_LINK_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Link_memoryBlockSizeElements";

    @objid ("eea5764b-b2df-43b4-a3fc-18b36f58fbd8")
    public static final String MEMORYBROKER_LINK_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Link_unMapServices";

    @objid ("4b0a38d1-804e-401c-b4fe-f03be99e7652")
    public static final String MEMORYBROKER_LINK_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Link_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << MemoryBroker_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c67022fb-f542-4f4f-bf73-4b3799b777df")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << MemoryBroker_Link >> then instantiate a {@link MemoryBrokerLink} proxy.
     * 
     * @return a {@link MemoryBrokerLink} proxy on the created {@link Link}.
     */
    @objid ("c420fcc1-6c32-4a3f-8498-d98002194120")
    public static MemoryBrokerLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerLink.STEREOTYPE_NAME);
        return MemoryBrokerLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerLink} proxy from a {@link Link} stereotyped << MemoryBroker_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link MemoryBrokerLink} proxy or <i>null</i>.
     */
    @objid ("cfc3c7d7-7264-4e2c-9115-483c9211cc94")
    public static MemoryBrokerLink instantiate(final Link obj) {
        return MemoryBrokerLink.canInstantiate(obj) ? new MemoryBrokerLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerLink} proxy from a {@link Link} stereotyped << MemoryBroker_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link MemoryBrokerLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("34041e89-626d-45df-ac4a-10e802e509fb")
    public static MemoryBrokerLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (MemoryBrokerLink.canInstantiate(obj))
        	return new MemoryBrokerLink(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("da5f48c9-6b7d-4b4b-97d8-6a2fe2ad9e36")
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
        MemoryBrokerLink other = (MemoryBrokerLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("8976a104-46ce-4cc1-85ab-2859125e4c26")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Link_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("04cbaa30-9978-4e23-9b9b-486c68ecb037")
    public String getMemoryBroker_Link_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("32b9604a-8e8f-4d42-8086-bea27378ee8e")
    public List<String> getMemoryBroker_Link_lockServices() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("721bb515-3fe8-4a5b-9fba-d5762682999f")
    public List<String> getMemoryBroker_Link_mapServices() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0abae2f9-878c-4e3f-83e8-5bdb22827698")
    public List<String> getMemoryBroker_Link_memories() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cc278e85-0329-42ec-b266-ed5007803d3b")
    public List<String> getMemoryBroker_Link_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f2e5cac7-1a8b-4bca-9028-106acffcaa19")
    public List<String> getMemoryBroker_Link_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2f010f93-b805-4dc9-a9f8-33b89d45dbc2")
    public List<String> getMemoryBroker_Link_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8690bbf9-8b85-4383-87f5-328ef4513b2e")
    public List<String> getMemoryBroker_Link_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @objid ("6fd7e9ad-e66f-4220-b205-242687eedea9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Link_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c0d734df-4204-43ef-a79d-b4317f2e7ec9")
    public void setMemoryBroker_Link_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("71c50807-2b68-476a-bdfe-83fd88e93733")
    public void setMemoryBroker_Link_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("39ac2466-b4be-4b55-b357-a81ceed8db5a")
    public void setMemoryBroker_Link_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e6ffe5fe-af36-45ad-939e-f26c86bb5e20")
    public void setMemoryBroker_Link_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1e555fae-80e2-468c-bd6b-22906b090642")
    public void setMemoryBroker_Link_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34ebbd44-1fe2-47f6-a972-1cd1ba7ac828")
    public void setMemoryBroker_Link_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e2aa925a-7c85-45cd-a45c-70b631e10593")
    public void setMemoryBroker_Link_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4cedc53f-7ba1-4494-81aa-af24b08f7436")
    public void setMemoryBroker_Link_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("6e00db73-43ae-4160-af72-9db40bbc9b65")
    protected MemoryBrokerLink(final Link elt) {
        super(elt);
    }

    @objid ("02692838-f6cd-457a-9379-ac4e04d488c8")
    public static final class MdaTypes {
        @objid ("4efb1783-1828-4710-8bd6-9765252ffbca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a0d2adde-fb23-4a25-a3f4-a550a7f1f298")
        public static TagType MEMORYBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("6d180c9e-d421-4912-a59e-690a63e21864")
        public static TagType MEMORYBROKER_LINK_MEMORIES_TAGTYPE_ELT;

        @objid ("ab3525a8-5277-4c2e-8378-e84d3a977f14")
        public static TagType MEMORYBROKER_LINK_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        @objid ("264d1adb-a491-418b-9f1c-c66f7c73fffa")
        public static TagType MEMORYBROKER_LINK_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("283d71d2-3c9b-4f93-a2cd-7a84bec4e721")
        public static TagType MEMORYBROKER_LINK_LOCKSERVICES_TAGTYPE_ELT;

        @objid ("751d0319-cfae-40e4-91ee-3e07ac6aa37c")
        public static TagType MEMORYBROKER_LINK_UNLOCKSERVICES_TAGTYPE_ELT;

        @objid ("4a4def0e-7869-4c22-bd42-703122d8a09e")
        public static TagType MEMORYBROKER_LINK_MAPSERVICES_TAGTYPE_ELT;

        @objid ("32d0c899-7e10-4a05-b859-782041003cb1")
        public static TagType MEMORYBROKER_LINK_UNMAPSERVICES_TAGTYPE_ELT;

        @objid ("457a8690-f00e-4506-b2b8-d72877e5f1cc")
        private static Stereotype MDAASSOCDEP;

        @objid ("97843251-0f08-4d6e-bccb-403f29d3d388")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a3077c4c-d351-4488-9470-1d14d5e200c8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0204e582-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5edd2e20-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LINK_MEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5edd2e1f-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LINK_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5edd2e1e-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LINK_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5edd2e1d-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LINK_LOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5edd2e1c-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LINK_UNLOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5edd2e1b-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LINK_MAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5edd2e1a-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LINK_UNMAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5edd2e19-172e-11df-b92a-0014222a9f79");
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
