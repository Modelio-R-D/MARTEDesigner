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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_buffer_HwDrive_HwRAM >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ac44fba4-6fa9-4937-9ef9-39b43686f5f2")
public class ProfileAssociationBufferHwDriveHwRAM {
    @objid ("2d5730eb-5b2e-46a4-bf30-515bb88da93f")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_buffer_HwDrive_HwRAM";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("e3185232-c0fd-4155-b8a1-780ed2b627a4")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationBufferHwDriveHwRAM proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_buffer_HwDrive_HwRAM >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c6aa7fe4-c417-47ba-9306-cb3ed70ac59e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBufferHwDriveHwRAM.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_buffer_HwDrive_HwRAM >> then instantiate a {@link ProfileAssociationBufferHwDriveHwRAM} proxy.
     * 
     * @return a {@link ProfileAssociationBufferHwDriveHwRAM} proxy on the created {@link Dependency}.
     */
    @objid ("d077e5d1-94fe-4151-b39d-0fc572337b14")
    public static ProfileAssociationBufferHwDriveHwRAM create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBufferHwDriveHwRAM.STEREOTYPE_NAME);
        return ProfileAssociationBufferHwDriveHwRAM.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBufferHwDriveHwRAM} proxy from a {@link Dependency} stereotyped << ProfileAssociation_buffer_HwDrive_HwRAM >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationBufferHwDriveHwRAM} proxy or <i>null</i>.
     */
    @objid ("f1edefde-35d0-442d-b523-dd870e79827f")
    public static ProfileAssociationBufferHwDriveHwRAM instantiate(final Dependency obj) {
        return ProfileAssociationBufferHwDriveHwRAM.canInstantiate(obj) ? new ProfileAssociationBufferHwDriveHwRAM(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBufferHwDriveHwRAM} proxy from a {@link Dependency} stereotyped << ProfileAssociation_buffer_HwDrive_HwRAM >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationBufferHwDriveHwRAM} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f0b63397-2aff-4b04-8f79-cbf03e54cb71")
    public static ProfileAssociationBufferHwDriveHwRAM safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationBufferHwDriveHwRAM.canInstantiate(obj))
        	return new ProfileAssociationBufferHwDriveHwRAM(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationBufferHwDriveHwRAM: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("68fa07f6-c2a1-4ec9-a01e-62a9e9801ad8")
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
        ProfileAssociationBufferHwDriveHwRAM other = (ProfileAssociationBufferHwDriveHwRAM) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("4b1c4baa-5a6f-457a-816f-f810bd9f84ab")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b80adf9b-3360-4085-aea6-fa0800ada77e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a61a29d5-5ba8-44b8-ac50-6fd302e063c2")
    protected ProfileAssociationBufferHwDriveHwRAM(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("581073ef-a5ce-45e8-bbee-8aca8d5b7f2c")
    public static final class MdaTypes {
        @objid ("1ab6a154-6b6f-4894-9d6a-5f57aca5852f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3df440dd-e59d-4251-833a-57fcbe2f56a2")
        private static Stereotype MDAASSOCDEP;

        @objid ("2bbf4bc4-62df-4aa0-ba67-aab5a80d70a6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f226d237-f7d5-45f7-b6d2-5dec219a5280")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6ccd3ed2-937d-11e0-b960-0027103f347c");
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
