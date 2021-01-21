/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << ConcurrencyResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1ea4a62a-7002-4f2e-8433-7bf5c40fb867")
public class ConcurrencyResourceParameter extends ResourceParameter {
    @objid ("f4fd82cf-bff3-400e-b529-70a3f4407a36")
    public static final String STEREOTYPE_NAME = "ConcurrencyResource_Parameter";

    /**
     * Tells whether a {@link ConcurrencyResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << ConcurrencyResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7d8a25b6-94ab-40c8-a9aa-6c927dd66b2e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << ConcurrencyResource_Parameter >> then instantiate a {@link ConcurrencyResourceParameter} proxy.
     * 
     * @return a {@link ConcurrencyResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("e3f26021-cfd7-4fb2-a381-c5879ba95791")
    public static ConcurrencyResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceParameter.STEREOTYPE_NAME);
        return ConcurrencyResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceParameter} proxy from a {@link Parameter} stereotyped << ConcurrencyResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link ConcurrencyResourceParameter} proxy or <i>null</i>.
     */
    @objid ("a6ebb73a-2355-4962-8e2e-89796b9d61da")
    public static ConcurrencyResourceParameter instantiate(final Parameter obj) {
        return ConcurrencyResourceParameter.canInstantiate(obj) ? new ConcurrencyResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceParameter} proxy from a {@link Parameter} stereotyped << ConcurrencyResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link ConcurrencyResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0655c252-d6ba-4ba3-a603-1c04a7035f73")
    public static ConcurrencyResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (ConcurrencyResourceParameter.canInstantiate(obj))
        	return new ConcurrencyResourceParameter(obj);
        else
        	throw new IllegalArgumentException("ConcurrencyResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4536cfc8-9458-46d6-9a93-ffaa20586fed")
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
        ConcurrencyResourceParameter other = (ConcurrencyResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("e08f0bce-28df-44b1-ba03-e824fbf43a75")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("4a397580-eb0d-4d58-9126-641edeb3fef3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c886b84d-54e0-4aec-9ee6-fbe75429f3f3")
    protected ConcurrencyResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("797372cf-e420-4969-b130-2510f151fe12")
    public static final class MdaTypes {
        @objid ("e6e2498f-4a3d-4fbd-a113-94dbbb5b3c14")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4c5d7d9b-b510-4417-b148-82c747621d6a")
        private static Stereotype MDAASSOCDEP;

        @objid ("548100ee-b8a1-4c3b-b3af-dbfa94f2780e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1affbbe0-b5d1-4d60-91e8-0853407a7c2a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "074ceafd-0f2d-11df-8c52-0014222a9f79");
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
