/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link;

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
 * Proxy class to handle a {@link Link} with << MemoryPartition_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("087c7fc8-62d0-4de9-9a4d-37fbee845962")
public class MemoryPartitionLink extends SwResourceLink {
    @objid ("4d655f99-e22e-4aeb-9617-76204b506f9f")
    public static final String STEREOTYPE_NAME = "MemoryPartition_Link";

    @objid ("599dbed0-27fa-45f2-a5e5-728ee494ac46")
    public static final String MEMORYPARTITION_LINK_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_Link_concurrentResources";

    @objid ("6f226937-7d57-4377-afc0-9e96c93cb0c2")
    public static final String MEMORYPARTITION_LINK_EXIT_TAGTYPE = "MemoryPartition_Link_exit";

    @objid ("d3f1b61d-57ff-4389-bdc3-8efb75eb8f40")
    public static final String MEMORYPARTITION_LINK_FORK_TAGTYPE = "MemoryPartition_Link_fork";

    @objid ("0b1c7f46-df9d-4f20-9ebe-b03470b2cfae")
    public static final String MEMORYPARTITION_LINK_MEMORYSPACES_TAGTYPE = "MemoryPartition_Link_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << MemoryPartition_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("67d7adac-c7b8-47b6-9eee-e89483e1f728")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << MemoryPartition_Link >> then instantiate a {@link MemoryPartitionLink} proxy.
     * 
     * @return a {@link MemoryPartitionLink} proxy on the created {@link Link}.
     */
    @objid ("c15686f0-57ed-41e9-83fe-3443505b4cc1")
    public static MemoryPartitionLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionLink.STEREOTYPE_NAME);
        return MemoryPartitionLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionLink} proxy from a {@link Link} stereotyped << MemoryPartition_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link MemoryPartitionLink} proxy or <i>null</i>.
     */
    @objid ("7c6eeb73-d393-489c-a606-a58f0265b27d")
    public static MemoryPartitionLink instantiate(final Link obj) {
        return MemoryPartitionLink.canInstantiate(obj) ? new MemoryPartitionLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionLink} proxy from a {@link Link} stereotyped << MemoryPartition_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link MemoryPartitionLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6a470cec-9362-45f8-8982-53239190affa")
    public static MemoryPartitionLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (MemoryPartitionLink.canInstantiate(obj))
        	return new MemoryPartitionLink(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bfeb811d-3f86-48fe-b59f-75dd154f4238")
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
        MemoryPartitionLink other = (MemoryPartitionLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("54a56897-7448-44f3-a254-8559cb7b9857")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Link_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e4af38d1-7f9d-47ca-afee-6ab00e01a46e")
    public List<String> getMemoryPartition_Link_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Link_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("41e31a02-67ea-4f44-be62-e2b8d3afbc14")
    public List<String> getMemoryPartition_Link_exit() {
        return this.elt.getTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Link_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("285efc8e-3d52-4d62-8da0-faac3d23d46b")
    public List<String> getMemoryPartition_Link_fork() {
        return this.elt.getTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Link_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ab34dd0f-bf99-4175-8c7b-e8265196f61b")
    public List<String> getMemoryPartition_Link_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_MEMORYSPACES_TAGTYPE_ELT);
    }

    @objid ("bc3c38e8-a7da-4827-b084-ee9114d63b10")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Link_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c29f40aa-d5b3-4bdb-b11e-14f4bcb0b601")
    public void setMemoryPartition_Link_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Link_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45cd41c6-553d-40ae-93aa-ff1c5a46b675")
    public void setMemoryPartition_Link_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Link_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("781ea50d-5f8b-48d1-b59b-2ed931458e8e")
    public void setMemoryPartition_Link_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Link_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2ae99857-5014-4d4d-b075-0f32b84048e7")
    public void setMemoryPartition_Link_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    @objid ("587abd40-0778-4935-8715-116918820856")
    protected MemoryPartitionLink(final Link elt) {
        super(elt);
    }

    @objid ("6b60e035-cd03-4d93-8d44-f8cbe0dd9592")
    public static final class MdaTypes {
        @objid ("66c39627-b256-4507-a64b-385484609598")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0318eb6b-d638-4e52-a209-1fed364ac050")
        public static TagType MEMORYPARTITION_LINK_CONCURRENTRESOURCES_TAGTYPE_ELT;

        @objid ("5e8f3ad0-4877-4d16-8fd9-0af7b70d0cb5")
        public static TagType MEMORYPARTITION_LINK_MEMORYSPACES_TAGTYPE_ELT;

        @objid ("6adffd23-d485-40cc-896e-5d148f7eb27e")
        public static TagType MEMORYPARTITION_LINK_FORK_TAGTYPE_ELT;

        @objid ("fee01575-15a9-48a0-8edb-e35f0cd9657d")
        public static TagType MEMORYPARTITION_LINK_EXIT_TAGTYPE_ELT;

        @objid ("84f163ab-ccb5-445c-a628-cbe44cc6daff")
        private static Stereotype MDAASSOCDEP;

        @objid ("e6622860-c9d6-4ecc-8c6f-d0717d3411b5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d19a4faf-388c-4ddf-952a-9aa36f8a09a0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01e5e758-0ccf-11df-8525-001302895b2b");
            MEMORYPARTITION_LINK_CONCURRENTRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f99f415-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_LINK_MEMORYSPACES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f99f416-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_LINK_FORK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f99f417-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_LINK_EXIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f99f418-172b-11df-b92a-0014222a9f79");
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
