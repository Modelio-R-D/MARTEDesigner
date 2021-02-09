/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class MemoryBrokerLink extends SwResourceLink {
    public static final String STEREOTYPE_NAME = "MemoryBroker_Link";

    public static final String MEMORYBROKER_LINK_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Link_accessPolicy";

    public static final String MEMORYBROKER_LINK_LOCKSERVICES_TAGTYPE = "MemoryBroker_Link_lockServices";

    public static final String MEMORYBROKER_LINK_MAPSERVICES_TAGTYPE = "MemoryBroker_Link_mapServices";

    public static final String MEMORYBROKER_LINK_MEMORIES_TAGTYPE = "MemoryBroker_Link_memories";

    public static final String MEMORYBROKER_LINK_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Link_memoryBlockAdressElements";

    public static final String MEMORYBROKER_LINK_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Link_memoryBlockSizeElements";

    public static final String MEMORYBROKER_LINK_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Link_unMapServices";

    public static final String MEMORYBROKER_LINK_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Link_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << MemoryBroker_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << MemoryBroker_Link >> then instantiate a {@link MemoryBrokerLink} proxy.
     * 
     * @return a {@link MemoryBrokerLink} proxy on the created {@link Link}.
     */
    public static MemoryBrokerLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerLink.STEREOTYPE_NAME);
        return MemoryBrokerLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerLink} proxy from a {@link Link} stereotyped << MemoryBroker_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link MemoryBrokerLink} proxy or <i>null</i>.
     */
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
    public static MemoryBrokerLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (MemoryBrokerLink.canInstantiate(obj))
        	return new MemoryBrokerLink(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Link_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMemoryBroker_Link_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Link_lockServices() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Link_mapServices() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Link_memories() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Link_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Link_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Link_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Link_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Link_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Link_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Link_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Link_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Link_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Link_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Link_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Link_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Link_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Link_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Link_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLink.MdaTypes.MEMORYBROKER_LINK_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    protected MemoryBrokerLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LINK_MEMORIES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LINK_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LINK_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LINK_LOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LINK_UNLOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LINK_MAPSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LINK_UNMAPSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
