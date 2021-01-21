/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.operation;

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
@objid ("308cfd8c-ba69-4ffa-a1fc-20e0bbff6942")
public class GrServiceOperation {
    @objid ("3b067adb-20d6-4ac4-a6a9-6c79b6eba6cf")
    public static final String STEREOTYPE_NAME = "GrService_Operation";

    @objid ("b4e0457f-b9d8-47a2-9f37-9c7045ff1673")
    public static final String GRSERVICE_OPERATION_OWNER_TAGTYPE = "GrService_Operation_owner";

    /**
     * The underlying {@link Operation} represented by this proxy, never null.
     */
    @objid ("170fbdde-1ae4-4aa5-ada2-f3492e1cd788")
    protected final Operation elt;

    /**
     * Tells whether a {@link GrServiceOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << GrService_Operation >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("54d97626-6b16-474c-b7ae-4b5005b90df0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << GrService_Operation >> then instantiate a {@link GrServiceOperation} proxy.
     * 
     * @return a {@link GrServiceOperation} proxy on the created {@link Operation}.
     */
    @objid ("e1b10a45-21de-45c7-a350-13086a6306fc")
    public static GrServiceOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceOperation.STEREOTYPE_NAME);
        return GrServiceOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link GrServiceOperation} proxy from a {@link Operation} stereotyped << GrService_Operation >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link GrServiceOperation} proxy or <i>null</i>.
     */
    @objid ("562153e4-d9d6-4c5d-865f-4bfaefb7c8cd")
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
    @objid ("5056756f-3aec-4c65-a2a4-d022d60dcd1e")
    public static GrServiceOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (GrServiceOperation.canInstantiate(obj))
        	return new GrServiceOperation(obj);
        else
        	throw new IllegalArgumentException("GrServiceOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("08bdabad-e01e-4513-86f3-ad9b8120c3f2")
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
    @objid ("1908d24f-a5ea-4462-bf9d-189ff3683b0e")
    public Operation getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GrService_Operation_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2b7fb75-ee9f-445e-91f5-b6dc6bbaa6ef")
    public String getGrService_Operation_owner() {
        return this.elt.getTagValue(GrServiceOperation.MdaTypes.GRSERVICE_OPERATION_OWNER_TAGTYPE_ELT);
    }

    @objid ("6356477d-57ad-4a33-9401-7364b5e9a2af")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GrService_Operation_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6b33049-c633-4e81-bde5-b5d36ab33338")
    public void setGrService_Operation_owner(final String value) {
        this.elt.putTagValue(GrServiceOperation.MdaTypes.GRSERVICE_OPERATION_OWNER_TAGTYPE_ELT, value);
    }

    @objid ("1308bd6a-beaf-4e01-8721-94136dee95db")
    protected GrServiceOperation(final Operation elt) {
        this.elt = elt;
    }

    @objid ("b0580805-97b9-4274-8e91-43c7fd9e6ba3")
    public static final class MdaTypes {
        @objid ("fe1b70cd-64a2-47ab-8f7d-a6e967dccf6f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("03ae760d-09fa-465f-8122-aa5bac1de5ac")
        public static TagType GRSERVICE_OPERATION_OWNER_TAGTYPE_ELT;

        @objid ("d91e868d-ca37-4e4a-98f1-99d4f5856386")
        private static Stereotype MDAASSOCDEP;

        @objid ("485bc3a9-2791-47d2-80a8-fdfd6aab9d67")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("47843eaa-d8ea-4443-9097-d8d80db4053a")
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
