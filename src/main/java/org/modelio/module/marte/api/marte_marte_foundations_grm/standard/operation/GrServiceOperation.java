/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.operation;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Operation} with << GrService_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GrServiceOperation {
    public static final String STEREOTYPE_NAME = "GrService_Operation";

    public static final String GRSERVICE_OPERATION_OWNER_TAGTYPE = "GrService_Operation_owner";

    /**
     * The underlying {@link Operation} represented by this proxy, never null.
     */
    protected final Operation elt;

    /**
     * Tells whether a {@link GrServiceOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << GrService_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << GrService_Operation >> then instantiate a {@link GrServiceOperation} proxy.
     * 
     * @return a {@link GrServiceOperation} proxy on the created {@link Operation}.
     */
    public static GrServiceOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceOperation.STEREOTYPE_NAME);
        return GrServiceOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link GrServiceOperation} proxy from a {@link Operation} stereotyped << GrService_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link GrServiceOperation} proxy or <i>null</i>.
     */
    public static GrServiceOperation instantiate(final Operation obj) {
        return GrServiceOperation.canInstantiate(obj) ? new GrServiceOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GrServiceOperation} proxy from a {@link Operation} stereotyped << GrService_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link GrServiceOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GrServiceOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (GrServiceOperation.canInstantiate(obj))
        	return new GrServiceOperation(obj);
        else
        	throw new IllegalArgumentException("GrServiceOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GrServiceOperation other = (GrServiceOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    public Operation getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GrService_Operation_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGrService_Operation_owner() {
        return this.elt.getTagValue(GrServiceOperation.MdaTypes.GRSERVICE_OPERATION_OWNER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GrService_Operation_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGrService_Operation_owner(final String value) {
        this.elt.putTagValue(GrServiceOperation.MdaTypes.GRSERVICE_OPERATION_OWNER_TAGTYPE_ELT, value);
    }

    protected GrServiceOperation(final Operation elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GRSERVICE_OPERATION_OWNER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ad278945-0f4a-11df-8c52-0014222a9f79");
            GRSERVICE_OPERATION_OWNER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bd92db13-0f4a-11df-8c52-0014222a9f79");
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
