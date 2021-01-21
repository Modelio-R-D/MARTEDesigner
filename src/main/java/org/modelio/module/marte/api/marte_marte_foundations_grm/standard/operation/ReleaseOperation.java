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
 * Proxy class to handle a {@link Operation} with << Release_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7f679249-6a8e-4124-a504-a4647fded63e")
public class ReleaseOperation extends GrServiceOperation {
    @objid ("fee844c9-de8c-4932-8031-78970c9fb22f")
    public static final String STEREOTYPE_NAME = "Release_Operation";

    /**
     * Tells whether a {@link ReleaseOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << Release_Operation >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8d27f5f7-57d7-4305-928a-4e5a041fe537")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << Release_Operation >> then instantiate a {@link ReleaseOperation} proxy.
     * 
     * @return a {@link ReleaseOperation} proxy on the created {@link Operation}.
     */
    @objid ("de4b3188-90a9-4736-91c3-d5460aebd3ed")
    public static ReleaseOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseOperation.STEREOTYPE_NAME);
        return ReleaseOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link ReleaseOperation} proxy from a {@link Operation} stereotyped << Release_Operation >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link ReleaseOperation} proxy or <i>null</i>.
     */
    @objid ("cb1f198e-d1a7-4d85-964b-8f88f3302ce1")
    public static ReleaseOperation instantiate(final Operation obj) {
        return ReleaseOperation.canInstantiate(obj) ? new ReleaseOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ReleaseOperation} proxy from a {@link Operation} stereotyped << Release_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link ReleaseOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6b162b47-cf27-4b3c-a6d2-28bbd6236cc8")
    public static ReleaseOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (ReleaseOperation.canInstantiate(obj))
        	return new ReleaseOperation(obj);
        else
        	throw new IllegalArgumentException("ReleaseOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fb2c5c61-6d6f-4f1e-aaf8-6c0256cce46a")
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
        ReleaseOperation other = (ReleaseOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @objid ("1541bce3-fbbc-4ffb-8990-68c481bf933d")
    @Override
    public Operation getElement() {
        return (Operation)super.getElement();
    }

    @objid ("d315152a-6d75-4559-b679-ce4617cc670b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cb899a04-b589-4fb9-9c70-b0a51d93648b")
    protected ReleaseOperation(final Operation elt) {
        super(elt);
    }

    @objid ("d2c4b653-bba5-42e7-9b5a-0a6500480437")
    public static final class MdaTypes {
        @objid ("cd3f6262-571e-4531-96ec-4e95b959adbf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e2d96437-86cf-435c-9891-1474bb0b2dc6")
        private static Stereotype MDAASSOCDEP;

        @objid ("9459b48d-67ba-4340-8bae-0096ea3847e7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6825084d-0ccb-4a6d-adbf-5f04e37c2d61")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b1b05a9c-14bf-11df-92f7-001302895b2b");
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
