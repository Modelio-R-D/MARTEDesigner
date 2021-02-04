/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_drivenBy_HwDMA_HwProcessor >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("cee1ea78-02ab-4281-98d1-e39060009654")
public class ProfileAssociationDrivenByHwDMAHwProcessor {
    @objid ("f4965bad-41e4-4457-8c98-d9496f4278da")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_drivenBy_HwDMA_HwProcessor";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("eb4f44cb-db15-4545-ae70-b5cc3f5ccb40")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDrivenByHwDMAHwProcessor proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_drivenBy_HwDMA_HwProcessor >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("13b57bd1-eba7-49ea-b106-f87b04fcd7e2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDrivenByHwDMAHwProcessor.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_drivenBy_HwDMA_HwProcessor >> then instantiate a {@link ProfileAssociationDrivenByHwDMAHwProcessor} proxy.
     * 
     * @return a {@link ProfileAssociationDrivenByHwDMAHwProcessor} proxy on the created {@link Dependency}.
     */
    @objid ("b67a20f9-d67a-48f7-ac02-60827c614e16")
    public static ProfileAssociationDrivenByHwDMAHwProcessor create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDrivenByHwDMAHwProcessor.STEREOTYPE_NAME);
        return ProfileAssociationDrivenByHwDMAHwProcessor.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDrivenByHwDMAHwProcessor} proxy from a {@link Dependency} stereotyped << ProfileAssociation_drivenBy_HwDMA_HwProcessor >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDrivenByHwDMAHwProcessor} proxy or <i>null</i>.
     */
    @objid ("671f54b1-4385-4b14-ae21-b5f997b1a05f")
    public static ProfileAssociationDrivenByHwDMAHwProcessor instantiate(final Dependency obj) {
        return ProfileAssociationDrivenByHwDMAHwProcessor.canInstantiate(obj) ? new ProfileAssociationDrivenByHwDMAHwProcessor(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDrivenByHwDMAHwProcessor} proxy from a {@link Dependency} stereotyped << ProfileAssociation_drivenBy_HwDMA_HwProcessor >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationDrivenByHwDMAHwProcessor} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("67a8bf5c-9baa-4588-ace1-4ac71bbfdb02")
    public static ProfileAssociationDrivenByHwDMAHwProcessor safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDrivenByHwDMAHwProcessor.canInstantiate(obj))
        	return new ProfileAssociationDrivenByHwDMAHwProcessor(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDrivenByHwDMAHwProcessor: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1dc1f82f-aeb9-4d3a-83df-439b59733d1f")
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
        ProfileAssociationDrivenByHwDMAHwProcessor other = (ProfileAssociationDrivenByHwDMAHwProcessor) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("f195322d-a366-48c1-954b-11a5066e7ccd")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("ad0aba3d-b489-45d6-b88e-5bbf1f05f6d1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("46a79c65-f333-402a-a51a-2c91c062b718")
    protected ProfileAssociationDrivenByHwDMAHwProcessor(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("a681cd0a-9374-47ca-89ba-00be10f5ce7a")
    public static final class MdaTypes {
        @objid ("614b6cdb-ed61-47f2-b2dc-1725af93b970")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("342ec4c8-c7a6-427f-97f0-d3f71c554f33")
        private static Stereotype MDAASSOCDEP;

        @objid ("fb91e05c-90ce-426f-bb77-83a70e2adb03")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e06d5314-9ea3-42c8-a225-092657ea39e3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a0d18452-936b-11e0-b960-0027103f347c");
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
