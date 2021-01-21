/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_managedMemories_HwStorageManager_HwMemory >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("32bf79bd-71b8-42f8-b66d-0567c03b4814")
public class ProfileAssociationManagedMemoriesHwStorageManagerHwMemory {
    @objid ("a993e2d3-d1c9-4ba7-91d6-ba5c57dbaf21")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_managedMemories_HwStorageManager_HwMemory";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("105d9a9e-80e6-4a71-a7f4-fa6c1158bdb2")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_managedMemories_HwStorageManager_HwMemory >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a9f7d86b-eca6-476e-b15f-e00e147cd2d0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationManagedMemoriesHwStorageManagerHwMemory.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_managedMemories_HwStorageManager_HwMemory >> then instantiate a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory} proxy.
     * 
     * @return a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory} proxy on the created {@link Dependency}.
     */
    @objid ("f3b3764f-2425-4f01-8622-e8567a9d329a")
    public static ProfileAssociationManagedMemoriesHwStorageManagerHwMemory create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationManagedMemoriesHwStorageManagerHwMemory.STEREOTYPE_NAME);
        return ProfileAssociationManagedMemoriesHwStorageManagerHwMemory.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory} proxy from a {@link Dependency} stereotyped << ProfileAssociation_managedMemories_HwStorageManager_HwMemory >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory} proxy or <i>null</i>.
     */
    @objid ("b43adcb4-c503-4c02-bc83-ec43ecb9b434")
    public static ProfileAssociationManagedMemoriesHwStorageManagerHwMemory instantiate(final Dependency obj) {
        return ProfileAssociationManagedMemoriesHwStorageManagerHwMemory.canInstantiate(obj) ? new ProfileAssociationManagedMemoriesHwStorageManagerHwMemory(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory} proxy from a {@link Dependency} stereotyped << ProfileAssociation_managedMemories_HwStorageManager_HwMemory >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a16497d4-d5c8-4ceb-aea3-c0245ae96a8e")
    public static ProfileAssociationManagedMemoriesHwStorageManagerHwMemory safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationManagedMemoriesHwStorageManagerHwMemory.canInstantiate(obj))
        	return new ProfileAssociationManagedMemoriesHwStorageManagerHwMemory(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationManagedMemoriesHwStorageManagerHwMemory: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fa3acbf4-3154-47d4-bef4-74e94b7b55f0")
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
        ProfileAssociationManagedMemoriesHwStorageManagerHwMemory other = (ProfileAssociationManagedMemoriesHwStorageManagerHwMemory) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("a50f3d30-8fbd-4547-a076-2fe0cfdfb175")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("e16a7df2-3f09-4b08-ba0a-cb5bc130a9a4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8b733bb7-986b-4926-be4d-bca557dabb5a")
    protected ProfileAssociationManagedMemoriesHwStorageManagerHwMemory(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("0caaff36-be2e-458a-b6b0-c86533f5e217")
    public static final class MdaTypes {
        @objid ("ca2ea8ea-3a2c-4f48-9a4c-dbce84aa4924")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b91528a5-a7cc-4365-a17f-dc90ab1359f8")
        private static Stereotype MDAASSOCDEP;

        @objid ("2aca4c23-a09c-45c0-910d-b203e752e14b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("16062d60-965e-4147-b454-d323503110ab")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cd8c181d-936b-11e0-b960-0027103f347c");
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
