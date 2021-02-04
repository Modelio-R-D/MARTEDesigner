/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
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
 * Proxy class to handle a {@link Lifeline} with << DeviceResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b0d440b4-63d3-43ad-9bca-7611257f2f23")
public class DeviceResourceLifeline extends ProcessingResourceLifeline {
    @objid ("5c0df4f8-d09a-4c21-a521-d7356ef52d08")
    public static final String STEREOTYPE_NAME = "DeviceResource_Lifeline";

    /**
     * Tells whether a {@link DeviceResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << DeviceResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("871d4bd4-e394-423e-9206-9a9bb0af5cfc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << DeviceResource_Lifeline >> then instantiate a {@link DeviceResourceLifeline} proxy.
     * 
     * @return a {@link DeviceResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("412a4b0c-f336-4d53-81a2-1c636e669c01")
    public static DeviceResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceLifeline.STEREOTYPE_NAME);
        return DeviceResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link DeviceResourceLifeline} proxy from a {@link Lifeline} stereotyped << DeviceResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link DeviceResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("5e70eac9-3b32-4e9e-88e0-77228d4822b4")
    public static DeviceResourceLifeline instantiate(final Lifeline obj) {
        return DeviceResourceLifeline.canInstantiate(obj) ? new DeviceResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceResourceLifeline} proxy from a {@link Lifeline} stereotyped << DeviceResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link DeviceResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("58b1e7ab-61a7-4cda-a80f-ce1adb2d1120")
    public static DeviceResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (DeviceResourceLifeline.canInstantiate(obj))
        	return new DeviceResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("DeviceResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("de7c277e-d7e2-43e8-9429-aa60129a5e2b")
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
        DeviceResourceLifeline other = (DeviceResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("8c87b43f-6cd8-4e08-92e8-0579a1eb327f")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("08b31f75-292a-49e9-852d-04792e3e5d42")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b61c2244-3649-4a65-b28f-f40aa0133a11")
    protected DeviceResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("9435f944-3221-4087-b8dc-45343f17b0f2")
    public static final class MdaTypes {
        @objid ("43c9f2b5-0881-438a-b738-b3fc5f321be5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5809e705-5e77-45a5-a767-e2d3d10da4fe")
        private static Stereotype MDAASSOCDEP;

        @objid ("79009139-2e75-4c73-a529-4382f407708f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2cd96019-a352-4e1b-afff-1056c0bd3e34")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84d5-0ccf-11df-8525-001302895b2b");
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
