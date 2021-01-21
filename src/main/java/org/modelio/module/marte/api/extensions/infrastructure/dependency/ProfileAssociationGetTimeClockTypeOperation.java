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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_getTime_ClockType_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ef02c721-5ca5-48d1-afad-450c5a78cded")
public class ProfileAssociationGetTimeClockTypeOperation {
    @objid ("15e833ad-96be-413a-a90d-61eef19eb022")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_getTime_ClockType_Operation";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("41a85a88-138c-4f6c-a331-4b9081aacc39")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationGetTimeClockTypeOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_getTime_ClockType_Operation >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d424ddd3-49c6-48f6-a27b-6c54a050e7ca")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationGetTimeClockTypeOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_getTime_ClockType_Operation >> then instantiate a {@link ProfileAssociationGetTimeClockTypeOperation} proxy.
     * 
     * @return a {@link ProfileAssociationGetTimeClockTypeOperation} proxy on the created {@link Dependency}.
     */
    @objid ("31847d0f-6e46-49a4-8e47-f9c156f22a94")
    public static ProfileAssociationGetTimeClockTypeOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationGetTimeClockTypeOperation.STEREOTYPE_NAME);
        return ProfileAssociationGetTimeClockTypeOperation.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationGetTimeClockTypeOperation} proxy from a {@link Dependency} stereotyped << ProfileAssociation_getTime_ClockType_Operation >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationGetTimeClockTypeOperation} proxy or <i>null</i>.
     */
    @objid ("ecfe7242-4e7b-40dc-81ef-6ac2fa160cf0")
    public static ProfileAssociationGetTimeClockTypeOperation instantiate(final Dependency obj) {
        return ProfileAssociationGetTimeClockTypeOperation.canInstantiate(obj) ? new ProfileAssociationGetTimeClockTypeOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationGetTimeClockTypeOperation} proxy from a {@link Dependency} stereotyped << ProfileAssociation_getTime_ClockType_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationGetTimeClockTypeOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ffb17877-ed0d-488a-916f-58683ed84110")
    public static ProfileAssociationGetTimeClockTypeOperation safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationGetTimeClockTypeOperation.canInstantiate(obj))
        	return new ProfileAssociationGetTimeClockTypeOperation(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationGetTimeClockTypeOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e54bf2b4-3af9-48fd-ba4c-4f92ba576352")
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
        ProfileAssociationGetTimeClockTypeOperation other = (ProfileAssociationGetTimeClockTypeOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("faac4439-16ea-4b94-b240-36d606d32036")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("19d686d0-74ec-4ff9-b675-0accc298da05")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1423ba9b-0862-46c8-b087-0f7f995beacf")
    protected ProfileAssociationGetTimeClockTypeOperation(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("1c977c94-5ee7-4ba3-9b30-0469f6515cbc")
    public static final class MdaTypes {
        @objid ("ec10a899-6d38-4029-affe-0844bd88014d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cf48ba08-b47f-47ce-8a86-19648bb1068e")
        private static Stereotype MDAASSOCDEP;

        @objid ("d6e94643-7367-4e76-b821-b577dbac0e88")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3c9c877f-779c-4121-b273-c5ba591868ca")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cfae173d-82bb-11df-b65a-0014222a9f79");
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
