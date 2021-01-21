/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend;

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
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.associationend.SwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << MemoryPartition_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9abfdb2f-9e86-40ff-8dd5-da596b798c81")
public class MemoryPartitionAssociationEnd extends SwResourceAssociationEnd {
    @objid ("cb3d73c6-667b-4081-882f-db707895e3c2")
    public static final String STEREOTYPE_NAME = "MemoryPartition_AssociationEnd";

    @objid ("8499b489-a23e-42a7-8667-fc4f4b35f76b")
    public static final String MEMORYPARTITION_ASSOCIATIONEND_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_AssociationEnd_concurrentResources";

    @objid ("9f82f415-2a04-4759-85fa-da83f170272c")
    public static final String MEMORYPARTITION_ASSOCIATIONEND_EXIT_TAGTYPE = "MemoryPartition_AssociationEnd_exit";

    @objid ("ef89666a-0abc-4fc9-8e76-549d24afa052")
    public static final String MEMORYPARTITION_ASSOCIATIONEND_FORK_TAGTYPE = "MemoryPartition_AssociationEnd_fork";

    @objid ("06f74ab1-6abc-4cc5-9f6a-ad25a7358c56")
    public static final String MEMORYPARTITION_ASSOCIATIONEND_MEMORYSPACES_TAGTYPE = "MemoryPartition_AssociationEnd_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << MemoryPartition_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ff174447-f22c-4f92-9a35-e52d28894840")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << MemoryPartition_AssociationEnd >> then instantiate a {@link MemoryPartitionAssociationEnd} proxy.
     * 
     * @return a {@link MemoryPartitionAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("b21c6bde-5cef-493a-a52d-3f19de59a81e")
    public static MemoryPartitionAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionAssociationEnd.STEREOTYPE_NAME);
        return MemoryPartitionAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << MemoryPartition_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link MemoryPartitionAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("2e6e642d-3206-427c-bef3-ddd19e8f46ed")
    public static MemoryPartitionAssociationEnd instantiate(final AssociationEnd obj) {
        return MemoryPartitionAssociationEnd.canInstantiate(obj) ? new MemoryPartitionAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << MemoryPartition_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link MemoryPartitionAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("419817fb-1cbd-41c4-af8a-190a615598fc")
    public static MemoryPartitionAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (MemoryPartitionAssociationEnd.canInstantiate(obj))
        	return new MemoryPartitionAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("005443fc-c2f0-441c-b641-3cbdbce61da6")
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
        MemoryPartitionAssociationEnd other = (MemoryPartitionAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("bb343b5f-2cc1-4213-937e-d7abd1bdd909")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_AssociationEnd_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("59eb4edb-a4b5-4188-b48d-fd239b1331a2")
    public List<String> getMemoryPartition_AssociationEnd_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_AssociationEnd_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("de557993-71fa-4356-a60f-353e4f3587ef")
    public List<String> getMemoryPartition_AssociationEnd_exit() {
        return this.elt.getTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_AssociationEnd_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c2cb2ddb-1668-47de-9b4d-8b155742237a")
    public List<String> getMemoryPartition_AssociationEnd_fork() {
        return this.elt.getTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_AssociationEnd_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f1ef5a70-81c8-4e4d-970c-f0dd117f7eb5")
    public List<String> getMemoryPartition_AssociationEnd_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_MEMORYSPACES_TAGTYPE_ELT);
    }

    @objid ("e0aa6de8-bd55-4fd5-b6c8-8ecb6de2167a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_AssociationEnd_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bff2b948-4c4c-42a1-8442-5f39e189eb92")
    public void setMemoryPartition_AssociationEnd_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_AssociationEnd_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("de973fe3-9943-4d64-949e-e3af3eaa0061")
    public void setMemoryPartition_AssociationEnd_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_AssociationEnd_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4407ba71-0c4f-4dce-a430-42da9779033d")
    public void setMemoryPartition_AssociationEnd_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_AssociationEnd_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("923b8504-43a0-42b9-ae8a-fb2a0df376a7")
    public void setMemoryPartition_AssociationEnd_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    @objid ("9c88e06f-8006-481b-bfa6-2377097cc964")
    protected MemoryPartitionAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("2fc87ed3-06ee-4c25-96a6-cb0a7ada9bff")
    public static final class MdaTypes {
        @objid ("003f1e27-1ed9-478b-a924-06980c124524")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2c901525-2de7-4c58-ad91-e9c9cd9e2ce8")
        public static TagType MEMORYPARTITION_ASSOCIATIONEND_CONCURRENTRESOURCES_TAGTYPE_ELT;

        @objid ("59114fbe-eec3-4edc-935c-9e023c73caa6")
        public static TagType MEMORYPARTITION_ASSOCIATIONEND_MEMORYSPACES_TAGTYPE_ELT;

        @objid ("2839a39b-fb7f-4d1f-948a-88d1d6bddfe8")
        public static TagType MEMORYPARTITION_ASSOCIATIONEND_FORK_TAGTYPE_ELT;

        @objid ("b19bc383-e888-4859-b5f0-f21735e53be3")
        public static TagType MEMORYPARTITION_ASSOCIATIONEND_EXIT_TAGTYPE_ELT;

        @objid ("2d0facca-74ba-4d7f-8b07-79610ee64e52")
        private static Stereotype MDAASSOCDEP;

        @objid ("7c6694b3-015b-4814-a1ba-da35ca33e33c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("00cb417b-d340-4dc6-b774-ca65c5e46453")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01e5e754-0ccf-11df-8525-001302895b2b");
            MEMORYPARTITION_ASSOCIATIONEND_CONCURRENTRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "229c0e29-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ASSOCIATIONEND_MEMORYSPACES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "229c0e2a-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ASSOCIATIONEND_FORK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "229c0e2b-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ASSOCIATIONEND_EXIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "229c0e2c-172b-11df-b92a-0014222a9f79");
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
