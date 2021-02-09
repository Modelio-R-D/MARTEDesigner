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
public class MemoryPartitionLink extends SwResourceLink {
    public static final String STEREOTYPE_NAME = "MemoryPartition_Link";

    public static final String MEMORYPARTITION_LINK_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_Link_concurrentResources";

    public static final String MEMORYPARTITION_LINK_EXIT_TAGTYPE = "MemoryPartition_Link_exit";

    public static final String MEMORYPARTITION_LINK_FORK_TAGTYPE = "MemoryPartition_Link_fork";

    public static final String MEMORYPARTITION_LINK_MEMORYSPACES_TAGTYPE = "MemoryPartition_Link_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << MemoryPartition_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << MemoryPartition_Link >> then instantiate a {@link MemoryPartitionLink} proxy.
     * 
     * @return a {@link MemoryPartitionLink} proxy on the created {@link Link}.
     */
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
    public static MemoryPartitionLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (MemoryPartitionLink.canInstantiate(obj))
        	return new MemoryPartitionLink(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MemoryPartitionLink other = (MemoryPartitionLink) obj;
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
     * Getter for List<String> property 'MemoryPartition_Link_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Link_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Link_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Link_exit() {
        return this.elt.getTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Link_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Link_fork() {
        return this.elt.getTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Link_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Link_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_MEMORYSPACES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Link_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Link_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Link_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Link_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Link_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Link_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Link_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Link_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLink.MdaTypes.MEMORYPARTITION_LINK_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    protected MemoryPartitionLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYPARTITION_LINK_CONCURRENTRESOURCES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_LINK_MEMORYSPACES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_LINK_FORK_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_LINK_EXIT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
