/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.package_;

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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << TimedDomain_NameSpace >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f9c03bc9-67e7-4fa0-87c5-94d97f196085")
public class TimedDomainNameSpace {
    @objid ("17dea6ae-c702-450b-99dd-92339a1d458a")
    public static final String STEREOTYPE_NAME = "TimedDomain_NameSpace";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("62f53c4f-4292-4848-9459-94796d8e50e4")
    protected final Package elt;

    /**
     * Tells whether a {@link TimedDomainNameSpace proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TimedDomain_NameSpace >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("50d60f62-b200-451a-9195-dcef5cf80021")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedDomainNameSpace.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << TimedDomain_NameSpace >> then instantiate a {@link TimedDomainNameSpace} proxy.
     * 
     * @return a {@link TimedDomainNameSpace} proxy on the created {@link Package}.
     */
    @objid ("8109e2a1-c530-4ea9-acdd-3777d8292ae0")
    public static TimedDomainNameSpace create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedDomainNameSpace.STEREOTYPE_NAME);
        return TimedDomainNameSpace.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link TimedDomainNameSpace} proxy from a {@link Package} stereotyped << TimedDomain_NameSpace >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link TimedDomainNameSpace} proxy or <i>null</i>.
     */
    @objid ("e1d5619d-03a7-402f-bf67-fe30538c5317")
    public static TimedDomainNameSpace instantiate(final Package obj) {
        return TimedDomainNameSpace.canInstantiate(obj) ? new TimedDomainNameSpace(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedDomainNameSpace} proxy from a {@link Package} stereotyped << TimedDomain_NameSpace >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link TimedDomainNameSpace} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fe2eff4d-fdd1-4952-b05f-520783c6936a")
    public static TimedDomainNameSpace safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (TimedDomainNameSpace.canInstantiate(obj))
        	return new TimedDomainNameSpace(obj);
        else
        	throw new IllegalArgumentException("TimedDomainNameSpace: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("03afed0c-2d49-4459-a616-06f3184da2f1")
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
        TimedDomainNameSpace other = (TimedDomainNameSpace) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("9f153d10-f810-464d-9717-9581750a3a45")
    public Package getElement() {
        return this.elt;
    }

    @objid ("c7c2afd7-dd9e-4966-ae25-0804fc9f8e4c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5de95d3a-44ff-4639-8d93-79bd230f6d31")
    protected TimedDomainNameSpace(final Package elt) {
        this.elt = elt;
    }

    @objid ("da523081-d427-4a7b-9869-6969fdd50061")
    public static final class MdaTypes {
        @objid ("966d03ff-3261-413b-8b3e-50c78e7c7eca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("09887a28-15da-4185-8563-e29b00e6cf02")
        private static Stereotype MDAASSOCDEP;

        @objid ("f41583ab-d21e-497d-91ac-cf7f86f41993")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("885bf830-c8b7-4f3b-bc71-ec45a1bc6f5c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dad723f0-0cce-11df-8525-001302895b2b");
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
