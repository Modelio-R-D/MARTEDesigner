/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaboration;

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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Collaboration} with << GrService_Collaboration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ccfd2be4-d175-4351-bc4d-b53ffdb2b255")
public class GrServiceCollaboration {
    @objid ("71d23f4e-ae61-41b6-8218-24c9096c2140")
    public static final String STEREOTYPE_NAME = "GrService_Collaboration";

    @objid ("36796802-2efa-4521-b502-e81460e9dddb")
    public static final String GRSERVICE_COLLABORATION_OWNER_TAGTYPE = "GrService_Collaboration_owner";

    /**
     * The underlying {@link Collaboration} represented by this proxy, never null.
     */
    @objid ("584de8e1-3d89-47f0-9dd5-fdfaca7d5a20")
    protected final Collaboration elt;

    /**
     * Tells whether a {@link GrServiceCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << GrService_Collaboration >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b3f8b6f3-8806-4cd3-bde0-f577c4fabdba")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << GrService_Collaboration >> then instantiate a {@link GrServiceCollaboration} proxy.
     * 
     * @return a {@link GrServiceCollaboration} proxy on the created {@link Collaboration}.
     */
    @objid ("91dc1830-5332-40d6-9f82-9a9cb074dd15")
    public static GrServiceCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceCollaboration.STEREOTYPE_NAME);
        return GrServiceCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link GrServiceCollaboration} proxy from a {@link Collaboration} stereotyped << GrService_Collaboration >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link GrServiceCollaboration} proxy or <i>null</i>.
     */
    @objid ("aaabf898-b42a-48fc-9b74-e0763def1268")
    public static GrServiceCollaboration instantiate(final Collaboration obj) {
        return GrServiceCollaboration.canInstantiate(obj) ? new GrServiceCollaboration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GrServiceCollaboration} proxy from a {@link Collaboration} stereotyped << GrService_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Collaboration}
     * @return a {@link GrServiceCollaboration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d95c359f-ba69-4d7a-b5c1-a04a0dd9b4d1")
    public static GrServiceCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (GrServiceCollaboration.canInstantiate(obj))
        	return new GrServiceCollaboration(obj);
        else
        	throw new IllegalArgumentException("GrServiceCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("45bfcdb3-fd2a-4065-a960-49bd8fc85028")
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
        GrServiceCollaboration other = (GrServiceCollaboration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    @objid ("03f261e6-529e-48f6-bbae-1dc19960e94a")
    public Collaboration getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GrService_Collaboration_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94007969-bc5d-4699-9a5f-38f3b43ab52c")
    public String getGrService_Collaboration_owner() {
        return this.elt.getTagValue(GrServiceCollaboration.MdaTypes.GRSERVICE_COLLABORATION_OWNER_TAGTYPE_ELT);
    }

    @objid ("1ba9b539-bbc5-4156-a799-4db436a2605a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GrService_Collaboration_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe87e6c1-967d-4e90-919f-b84d7f857b3c")
    public void setGrService_Collaboration_owner(final String value) {
        this.elt.putTagValue(GrServiceCollaboration.MdaTypes.GRSERVICE_COLLABORATION_OWNER_TAGTYPE_ELT, value);
    }

    @objid ("56b84ee7-a96a-4bd2-9207-b687c269ea8f")
    protected GrServiceCollaboration(final Collaboration elt) {
        this.elt = elt;
    }

    @objid ("b9b1425e-bf20-4e1d-96d1-b6ed38e15349")
    public static final class MdaTypes {
        @objid ("b6235913-4fa4-42d7-b27c-697d713958af")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0ca82b61-5e76-408f-ade4-b7f667a0bf27")
        public static TagType GRSERVICE_COLLABORATION_OWNER_TAGTYPE_ELT;

        @objid ("70eab624-2f08-43e5-a7ec-16d00531d6a2")
        private static Stereotype MDAASSOCDEP;

        @objid ("0b2f36e7-cede-4255-964b-d3f20d87b583")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0abac270-e5ea-4829-ad71-74f5a83e67b2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a67068-0ccf-11df-8525-001302895b2b");
            GRSERVICE_COLLABORATION_OWNER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a8d2bc-0ccf-11df-8525-001302895b2b");
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
