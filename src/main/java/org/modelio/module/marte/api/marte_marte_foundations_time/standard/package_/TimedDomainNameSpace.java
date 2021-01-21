/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("cb394c0e-dcca-4da5-aec3-3fb1a05ee706")
    public static final String STEREOTYPE_NAME = "TimedDomain_NameSpace";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("2d97d4db-2062-493a-bfa9-5938cfc44403")
    protected final Package elt;

    /**
     * Tells whether a {@link TimedDomainNameSpace proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TimedDomain_NameSpace >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("60d3df1a-705f-4a0b-978c-9cbbb6da1a70")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedDomainNameSpace.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << TimedDomain_NameSpace >> then instantiate a {@link TimedDomainNameSpace} proxy.
     * 
     * @return a {@link TimedDomainNameSpace} proxy on the created {@link Package}.
     */
    @objid ("05bb6888-107e-400d-9b3c-66e05f93007d")
    public static TimedDomainNameSpace create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Package");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedDomainNameSpace.STEREOTYPE_NAME);
        return TimedDomainNameSpace.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link TimedDomainNameSpace} proxy from a {@link Package} stereotyped << TimedDomain_NameSpace >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link TimedDomainNameSpace} proxy or <i>null</i>.
     */
    @objid ("1150c6bb-959c-4712-930f-abc5efd25b74")
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
    @objid ("c92a1d95-419c-483b-b1b8-9b3db73d5b68")
    public static TimedDomainNameSpace safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (TimedDomainNameSpace.canInstantiate(obj))
        	return new TimedDomainNameSpace(obj);
        else
        	throw new IllegalArgumentException("TimedDomainNameSpace: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ce0097b4-ed2f-45ff-b850-108cb33c150c")
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
    @objid ("e41a7eec-ad9e-4613-82e0-c066a49aba7f")
    public Package getElement() {
        return this.elt;
    }

    @objid ("220ffd47-87b5-481d-b4a3-3977eac5e0fe")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("025d4493-308d-443d-bc3d-db7d5d33cd83")
    protected TimedDomainNameSpace(final Package elt) {
        this.elt = elt;
    }

    @objid ("da523081-d427-4a7b-9869-6969fdd50061")
    public static final class MdaTypes {
        @objid ("83c47ddd-0393-43b5-8cd3-916f4b74bb81")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0b223beb-94b6-4365-b84a-4b90f5a9dbbc")
        private static Stereotype MDAASSOCDEP;

        @objid ("01d14545-86e2-4499-a722-7adcf814ac4c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3ff0fd11-d4d3-4582-ba5d-9846cac425d9")
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
