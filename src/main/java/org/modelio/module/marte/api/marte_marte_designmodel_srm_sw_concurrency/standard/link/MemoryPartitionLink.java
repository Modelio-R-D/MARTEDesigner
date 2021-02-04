/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("dfa7a548-5a87-4973-8594-3b706e032f6a")
    public static final String STEREOTYPE_NAME = "MemoryPartition_Link";

    @objid ("ce782929-01dc-47a1-806f-a642041a645e")
    public static final String MEMORYPARTITION_LINK_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_Link_concurrentResources";

    @objid ("cee8226d-8d99-437c-9e89-8ee7589dc14d")
    public static final String MEMORYPARTITION_LINK_EXIT_TAGTYPE = "MemoryPartition_Link_exit";

    @objid ("3d1b75d0-4dae-4114-bee3-4deb3e83f75d")
    public static final String MEMORYPARTITION_LINK_FORK_TAGTYPE = "MemoryPartition_Link_fork";

    @objid ("885ec870-fe0c-4269-9538-12d13c4deaab")
    public static final String MEMORYPARTITION_LINK_MEMORYSPACES_TAGTYPE = "MemoryPartition_Link_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << MemoryPartition_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("13e311e5-bd2f-43d1-87a0-b97f807c2760")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << MemoryPartition_Link >> then instantiate a {@link MemoryPartitionLink} proxy.
     * 
     * @return a {@link MemoryPartitionLink} proxy on the created {@link Link}.
     */
    @objid ("60dd287a-8647-4614-9fb2-4d39f1464e1e")
    public static MemoryPartitionLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionLink.STEREOTYPE_NAME);
        return MemoryPartitionLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionLink} proxy from a {@link Link} stereotyped << MemoryPartition_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link MemoryPartitionLink} proxy or <i>null</i>.
     */
    @objid ("c4ef5f92-9ed3-4c5e-a6b3-60160fa18626")
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
    @objid ("94c2dbe6-5bb3-48e1-84c1-170edda753e4")
    public static MemoryPartitionLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (MemoryPartitionLink.canInstantiate(obj))
        	return new MemoryPartitionLink(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ff2bb929-e733-466c-a528-623548809438")
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
    @objid ("5fa1b1ee-dad9-4e16-9868-e2d8c63ffb63")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Link_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("24668429-c20b-47af-9c43-b03be75ad0f9")
    public List<String> getMemoryPartition_Link_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Link_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("16017f9b-785d-453a-b33e-4bde910381d7")
    public List<String> getMemoryPartition_Link_exit() {
        return this.elt.getTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Link_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6c24c908-d427-4d86-bc54-1e2266a987c9")
    public List<String> getMemoryPartition_Link_fork() {
        return this.elt.getTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Link_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0f2ddb1c-a45a-4dce-9589-7dad5c77fe72")
    public List<String> getMemoryPartition_Link_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_MEMORYSPACES_TAGTYPE_ELT);
    }

    @objid ("a9d8ff55-6915-4f5c-a238-f13cc1ab7d5e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Link_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b723b6f2-5d12-4f7e-b21e-5875696789f4")
    public void setMemoryPartition_Link_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Link_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3220ca2e-a676-44bc-92bc-d5d8132da211")
    public void setMemoryPartition_Link_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Link_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9a1427f1-e1e0-44c2-bbf4-46023a426baf")
    public void setMemoryPartition_Link_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Link_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("405ba7b5-866c-4b80-b574-42387eb386de")
    public void setMemoryPartition_Link_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    @objid ("9fa533e0-7fc8-43c4-83cd-becdbeac102c")
    protected MemoryPartitionLink(final Link elt) {
        super(elt);
    }

    @objid ("6b60e035-cd03-4d93-8d44-f8cbe0dd9592")
    public static final class MdaTypes {
        @objid ("d321827a-bd95-415f-9e37-65d7a47dc7ed")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("53067397-ac86-4031-a329-d462b78b3420")
        public static TagType MEMORYPARTITION_LINK_CONCURRENTRESOURCES_TAGTYPE_ELT;

        @objid ("38d55332-88a6-4914-9bca-c31ef1b8460f")
        public static TagType MEMORYPARTITION_LINK_MEMORYSPACES_TAGTYPE_ELT;

        @objid ("045b3876-3015-4ce4-a1e4-b2cefef6f875")
        public static TagType MEMORYPARTITION_LINK_FORK_TAGTYPE_ELT;

        @objid ("0f59fa8a-9ccd-4bf0-9cdc-c5c683779cb0")
        public static TagType MEMORYPARTITION_LINK_EXIT_TAGTYPE_ELT;

        @objid ("c0c42744-3794-4a28-98dc-b7ca9d340913")
        private static Stereotype MDAASSOCDEP;

        @objid ("295b9c29-63a6-4273-8fb8-4ef7bac1bc13")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e0931c5e-0167-48af-b7a7-54e4b8f9a087")
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
